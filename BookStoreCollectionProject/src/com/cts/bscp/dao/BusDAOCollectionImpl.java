package com.cts.bscp.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.cts.bscp.exception.BusStoreException;
import com.cts.bscp.model.Bus;

public class BusDAOCollectionImpl implements IBusDAO {
	
	private Map<String, Bus> buses;
	
	public BusDAOCollectionImpl() {
		buses = new TreeMap<>();
	}
	
	@Override
	public String add(Bus Bus) throws BusStoreException {
		String bcode = null;
		if (Bus != null) {
			bcode = Bus.getBcode();
			buses.put(bcode, Bus);	
		}
		return bcode;
	}
	
	@Override
	public boolean delete(String bcode) throws BusStoreException {
		boolean isDone = false;
		if (bcode != null) {
			buses.remove(bcode);
			isDone = true;
		}
		return isDone;
	}
	
	@Override
	public Bus get(String bcode) throws BusStoreException {
		return buses.get(bcode);
	}
	

	@Override
	public List<Bus> getAll() throws BusStoreException {
		return new ArrayList<>(buses.values());
	}
	
	@Override
	public boolean update(Bus Bus) throws BusStoreException {
		boolean isDone = false;
		if (Bus != null) {
			String bcode = Bus.getBcode();
			buses.replace(bcode, Bus);
			
		}
		return isDone;
	}

	@Override
	public void persist() throws BusStoreException {
		/* no implementation is required */
	}
	
	
}
