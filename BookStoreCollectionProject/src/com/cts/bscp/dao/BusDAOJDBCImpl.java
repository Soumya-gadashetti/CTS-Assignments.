package com.cts.bscp.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cts.bscp.exception.BusStoreException;
import com.cts.bscp.model.Bus;
import com.cts.bscp.util.ConnectionProvider;

//import org.apache.log4j.Logger;

public class BusDAOJDBCImpl implements IBusDAO {

	ConnectionProvider conProvider;
	//Logger log;

	public BusDAOJDBCImpl() throws BusStoreException {
		// log = Logger.getLogger("dao");

		try {
			conProvider = ConnectionProvider.getInstance();
		} catch (ClassNotFoundException | IOException exp) {
			//log.error(exp);
			throw new BusStoreException("Database is not reachable");
		}
	}

	@Override
	public String add(Bus Bus) throws BusStoreException {
		String bcode = null;
		if (Bus != null) {
			try (Connection con = conProvider.getConnection();
					PreparedStatement pInsert = con
							.prepareStatement(IQueryMapper.ADD_BUS_QRY)) {

				pInsert.setString(1, Bus.getBcode());
				pInsert.setString(2, Bus.getTitle());
				pInsert.setDouble(3, Bus.getPrice());
				pInsert.setDate(4, Date.valueOf(Bus.getArrivalDate()));

				int rowCount = pInsert.executeUpdate();

				if (rowCount == 1) {
					bcode = Bus.getBcode();
				}
			} catch (SQLException exp) {
				//log.error(exp);
				throw new BusStoreException("Bus is not inserted");
			}
		}
		return bcode;
	}

	@Override
	public boolean delete(String bcode) throws BusStoreException {
		boolean isDone = false;

		try (Connection con = conProvider.getConnection();
				PreparedStatement pDelete = con
						.prepareStatement(IQueryMapper.DEL_BUS_QRY)) {

			pDelete.setString(1, bcode);

			int rowCount = pDelete.executeUpdate();

			if (rowCount == 1) {
				isDone = true;
			}
		} catch (SQLException exp) {
			//log.error(exp);
			throw new BusStoreException("Bus is not inserted");
		}

		return isDone;
	}

	@Override
	public Bus get(String bcode) throws BusStoreException {
		Bus Bus=null;
		try (Connection con = conProvider.getConnection();
				PreparedStatement pSelect = con
						.prepareStatement(IQueryMapper.GET_BUS_QRY)) {

			pSelect.setString(1, bcode);

			ResultSet rs = pSelect.executeQuery();
			
			if(rs.next()){
				Bus = new Bus();
				Bus.setBcode(rs.getString("bcode"));
				Bus.setTitle(rs.getString("title"));
				Bus.setPrice(rs.getDouble("price"));
				Bus.setArrivalDate(rs.getDate("pdate").toLocalDate());
			}
			
		} catch (SQLException exp) {
			//log.error(exp);
			throw new BusStoreException("Bus is not available");
		}		
		return Bus;
	}

	@Override
	public List<Bus> getAll() throws BusStoreException {
		List<Bus> buses=null;
		try (Connection con = conProvider.getConnection();
				PreparedStatement pSelect = con
						.prepareStatement(IQueryMapper.GET_ALL_BUS_QRY)) {

			ResultSet rs = pSelect.executeQuery();
			
			buses = new ArrayList<Bus>();
			
			while(rs.next()){
				Bus Bus = new Bus();
				Bus.setBcode(rs.getString("bcode"));
				Bus.setTitle(rs.getString("title"));
				Bus.setPrice(rs.getDouble("price"));
				Bus.setArrivalDate(rs.getDate("pdate").toLocalDate());
				buses.add(Bus);
			}
			
		} catch (SQLException exp) {
			//log.error(exp);
			throw new BusStoreException("No buses are available.");
		}		
		return buses;	
	}

	@Override
	public boolean update(Bus bus) throws BusStoreException {
		boolean isDone = false;
		if (bus != null) {
			try (Connection con = conProvider.getConnection();
					PreparedStatement pUpdate = con
							.prepareStatement(IQueryMapper.MODIFY_BUS_QRY)) {

				
				pUpdate.setString(1, bus.getTitle());
				pUpdate.setDouble(2, bus.getPrice());
				pUpdate.setDate(3, Date.valueOf(bus.getArrivalDate()));
				pUpdate.setString(4, bus.getBcode());
				

				int rowCount = pUpdate.executeUpdate();

				if (rowCount == 1) {
					isDone = true;
				}
			} catch (SQLException exp) {
				//log.error(exp);
				throw new BusStoreException("Bus is not updated.");
			}
		}
		return isDone;
	}

	@Override
	public void persist() throws BusStoreException {
		/* no implementation required */
		
	}
}