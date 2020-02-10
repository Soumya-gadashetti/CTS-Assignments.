package com.cts.bscp.service;
//import com.cts.bscp.service.IBusService.persist;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.cts.bscp.dao.BusDAOJDBCImpl;
import com.cts.bscp.dao.IBusDAO;
import com.cts.bscp.exception.BusStoreException;
import com.cts.bscp.model.Bus;

public class BusServiceImpl implements IBusService {
	
	private IBusDAO busDao;

	public IBusDAO getDAO(){
		return busDao;
	}
	
	public BusServiceImpl() throws BusStoreException {
		//busDao = new BusDAOCollectionImpl();
		// busDao = new BusDAOIOStreamImp1();
		busDao = new BusDAOJDBCImpl();
	}
	
	public boolean isValidBcode(String bcode){
		
		/*
		 * First letter must be capital
		 * Followed by three digits
		 */
		Pattern bcodePattern = Pattern.compile("[A-Z]\\d{3}");
		Matcher bcodeMatcher = bcodePattern.matcher(bcode);
		
		return bcodeMatcher.matches();
	}
	
	public boolean isValidTitle(String title){
		/*
		 * First Letter should be capital
		 * Minimum length is 4 chars
		 * Maximum length is 20 chars.		
		 */
		Pattern titlePattern = Pattern.compile("[A-Z]\\w{3,19}");
		Matcher titleMatcher = titlePattern.matcher(title);
		
		return titleMatcher.matches();
	}
	
	public boolean isValidPrice(double price){
		/*
		 * Price is between 5 and 5000
		 */
		return price>=5 && price<=5000;
	}
	
	public boolean isValidArrivalDate(LocalDate arrivalDate){
		/*
		 * publish date should not be greater than the current day.
		 */
		LocalDate today = LocalDate.now();
		//return arrivalDate.isBefore(today) || arrivalDate.equals(today);
		return today.isAfter(arrivalDate) || arrivalDate.equals(today);
	}
	
	public boolean isValidBus(Bus Bus) throws BusStoreException{
		boolean isValid=false;
		
		List<String> errMsgs = new ArrayList<>();
		
		if(!isValidBcode(Bus.getBcode()))
			errMsgs.add("bcode should start with a capital alphabet followed by 3 digits");
		
		if(!isValidTitle(Bus.getTitle()))
			errMsgs.add("Title must start with capital and must be in between 4 to 20 chars in length");
		
		if(!isValidPrice(Bus.getPrice()))
			errMsgs.add("Price must be between INR.5 and INR.5000");
		
		if(!isValidArrivalDate(Bus.getArrivalDate()))
			errMsgs.add("Publish Date should not be a future date");
		
		if(errMsgs.size()==0)
			isValid=true;
		else
			throw new BusStoreException(errMsgs.toString());
		
		return isValid;
	}


	@Override
	public String add(Bus Bus) throws BusStoreException {
		String bcode=null;
		if(Bus!=null && isValidBus(Bus)){
			bcode=busDao.add(Bus);
		}
		return bcode;
	}

	@Override
	public boolean delete(String bcode) throws BusStoreException {
		boolean isDone=false;
		if(bcode!=null && isValidBcode(bcode)){
			busDao.delete(bcode);
			isDone = true;
		}else{
			throw new BusStoreException("bcode should be a capital letter followed by 3 digits");
		}
		return isDone;
	}

	@Override
	public Bus get(String bcode) throws BusStoreException {
		return busDao.get(bcode);
	}

	@Override
	public List<Bus> getAll() throws BusStoreException {
		return busDao.getAll();
	}

	@Override
	public boolean update(Bus Bus) throws BusStoreException {
		boolean isDone = false;
		
		if(Bus!=null && isValidBus(Bus)){
			isDone = busDao.update(Bus);
		}
		
		return isDone;
	}

	@Override
	public void persist() throws BusStoreException {
		// TODO Auto-generated method stub
		
	}


//	@Override
//	public void persist() throws BookStoreException {
//		busDao.persist();
//	}
}
