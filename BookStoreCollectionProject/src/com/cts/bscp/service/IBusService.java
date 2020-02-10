package com.cts.bscp.service;
//import com.cts.bscp.service.IBusService.persist;
import java.util.List;

import com.cts.bscp.exception.BusStoreException;
import com.cts.bscp.model.Bus;

public interface IBusService {	
	String add(Bus Bus) throws BusStoreException;
	boolean delete(String bcode) throws BusStoreException;
	Bus get(String bcode) throws BusStoreException;
	List<Bus> getAll() throws BusStoreException;;
	boolean update(Bus Bus) throws BusStoreException;
	void persist()throws BusStoreException;
}
