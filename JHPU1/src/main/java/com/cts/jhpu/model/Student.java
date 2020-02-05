package com.cts.jhpu.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Student")
public class Student {
	@EmbeddedId
	private StudentIdentity sid;
	@Column(name="fnm",nullable=false)
	private String firstName;
	
	@Column(name="lnm")
	private String lastName;
	@Column(name="dob",nullable=false)
	private Date dateofBirth;
	
	public Student() {
		
	}

	public Student(StudentIdentity sid, String firstName, String lastName, Date dateofBirth) {
		super();
		this.sid = sid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateofBirth = dateofBirth;
	}

	public StudentIdentity getSid() {
		return sid;
	}

	public void setSid(StudentIdentity sid) {
		this.sid = sid;
	}

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

	public Date getDateofBirth() {
		return dateofBirth;
	}

	public void setDateofBirth(Date dateofBirth) {
		this.dateofBirth = dateofBirth;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", firstName=" + firstName + ", lastName=" + lastName + ", dateofBirth="
				+ dateofBirth + "]";
	}
	
	

}
