package com.cts.bscp.dao;

import com.cts.bscp.model.Bus;
import com.cts.bscp.exception.BusStoreException;

import java.util.List;

public interface IBusDAO {	
	String add(Bus Bus) throws BusStoreException;
	boolean delete(String bcode)throws BusStoreException;
	Bus get(String bcode) throws BusStoreException;;
	List<Bus> getAll() throws BusStoreException;;
	boolean update(Bus Bus) throws BusStoreException;
	void persist()throws BusStoreException;
}
