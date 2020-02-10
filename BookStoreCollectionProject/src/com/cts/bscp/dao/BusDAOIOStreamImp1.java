package com.cts.bscp.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.cts.bscp.exception.BusStoreException;
import com.cts.bscp.model.Bus;

public class BusDAOIOStreamImp1 implements IBusDAO {
	public static final String DATA_STORE_FILE_NAME = "bookstore.text";

	private Map<String, Bus> buses;

	public BusDAOIOStreamImp1() throws BusStoreException {
		File file = new File(DATA_STORE_FILE_NAME);

		if (!file.exists()) {
			buses = new TreeMap<>();
		} else {
			try (ObjectInputStream fin = new ObjectInputStream(
					new FileInputStream(DATA_STORE_FILE_NAME))) {

				Object obj = fin.readObject();

				if (obj instanceof Map) {
					buses = (Map<String, Bus>) obj;
				} else {
					throw new BusStoreException("Not a valid DataStore");
				}
			} catch (IOException | ClassNotFoundException exp) {
				throw new BusStoreException("Loading Data Failed");
			}
		}
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
		return new ArrayList<Bus>(buses.values());
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

	
	public void persist() throws BusStoreException {
		try (ObjectOutputStream fout = new ObjectOutputStream(
				new FileOutputStream(DATA_STORE_FILE_NAME))) {
			fout.writeObject(buses);
		} catch (IOException exp) {
			throw new BusStoreException("Saving Data Failed");
		}
	}
}

