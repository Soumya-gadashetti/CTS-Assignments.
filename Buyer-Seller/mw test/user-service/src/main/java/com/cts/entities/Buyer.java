package com.cts.entities;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;

@Entity(name = "Buyers")
public class Buyer extends User {

	private String firstName;
	private String lastName;
	@Column(unique = true)
	private String emailId;
	private String mobileNumber;
	@Embedded
	private Address address;
	private String createdDate;
	
	
	public Buyer(){
		
	}

public Buyer(int userId, String userName, String password, String role) {
		super(userId, userName, password, role);
	}

public Buyer(int userId, String userName, String password, String role, String firstName, String lastName,
			String emailId, String mobileNumber, Address address, String createdDate) {
		super(userId, userName, password, role);
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.mobileNumber = mobileNumber;
		this.address = address;
		this.createdDate = createdDate;
	}

//	public Buyer(int userId, String userName, String password, String role) {
//		super(userId, userName, password, role);
//	}
//	

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

//	public Buyer(int userId, String userName, String password, String role, String firstName, String lastName,
//			String emailId, String mobileNumber, Address address, String createdDate) {
//		super(userId, userName, password, role);
//		this.firstName = firstName;
//		this.lastName = lastName;
//		this.emailId = emailId;
//		this.mobileNumber = mobileNumber;
//		this.address = address;
//		this.createdDate = createdDate;
//	}


}
