package com.cts.jhpu.model;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Table;

//@Entity
//@Table(name="address")
@Embeddable
public class Address implements Serializable {
	private String dNo;
	private String AddressLine1;
	private String AddressLine2;
	public Address() {
		super();
	}
	public Address(String dNo, String addressLine1, String addressLine2) {
		super();
		this.dNo = dNo;
		AddressLine1 = addressLine1;
		AddressLine2 = addressLine2;
	}
	public String getdNo() {
		return dNo;
	}
	public void setdNo(String dNo) {
		this.dNo = dNo;
	}
	public String getAddressLine1() {
		return AddressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		AddressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return AddressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		AddressLine2 = addressLine2;
	}
	

}
