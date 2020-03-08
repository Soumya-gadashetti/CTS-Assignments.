package com.cts.entities;

import javax.persistence.Embedded;
import javax.persistence.Entity;

@Entity(name = "Sellers")
public class Seller extends User {
	private String firstName;
	private String lastName;
	private String companyName;
	private String companyDescription;
	@Embedded
	private Address address;
	private String website;
	private String emailId;
	private String phone;
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
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyDescription() {
		return companyDescription;
	}
	public void setCompanyDescription(String companyDescription) {
		this.companyDescription = companyDescription;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	public Seller() {
		
	}
	
	public Seller(int userId, String userName, String password, String role) {
		super(userId, userName, password, role);
	}
	public Seller(int userId, String userName, String password, String role, String firstName, String lastName,
			String companyName, String companyDescription, Address address, String website, String emailId,
			String phone) {
		super(userId, userName, password, role);
		this.firstName = firstName;
		this.lastName = lastName;
		this.companyName = companyName;
		this.companyDescription = companyDescription;
		this.address = address;
		this.website = website;
		this.emailId = emailId;
		this.phone = phone;
	}

}
