package com.cts.bscp.dao;

public interface IQueryMapper {

	public static final String ADD_BUS_QRY = 
			"INSERT INTO buses(bcode,  title, price, pdate) VALUES(?,?,?,?)";
	public static final String MODIFY_BUS_QRY = 
			"UPDATE buses SET title=?,price=?,pdate=? WHERE bcode=?";
	public static final String DEL_BUS_QRY = 
			"DELETE FROM buses WHERE bcode=?";
	public static final String GET_ALL_BUS_QRY = 
			"SELECT * FROM buses";
	public static final String GET_BUS_QRY = 
			"SELECT * FROM buses WHERE bcode=?";
}