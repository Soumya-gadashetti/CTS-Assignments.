package com.cts.jhpu.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="faculty")
public class Faculty {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long factId;
	private String factName;
	@Embedded
	private Address address;
	public Faculty() {
		super();
	}
	
	public Faculty( String factName,Address address) {
		super();
		//this.factId = factId;
		this.factName = factName;
		this.address=address;
	}
	public Long getFactId() {
		return factId;
	}
	public void setFactId(Long factId) {
		this.factId = factId;
	}
	public String getFactName() {
		return factName;
	}
	public void setFactName(String factName) {
		this.factName = factName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	

}
