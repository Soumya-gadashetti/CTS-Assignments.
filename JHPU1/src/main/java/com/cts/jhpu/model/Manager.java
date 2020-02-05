package com.cts.jhpu.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("empManager")
@Table(name="manag")
//@Table(name="manag_only")  //single per class

public class Manager extends Emp {
	@Column(name="allow")
	private double allaoance;

	public Manager() {
		super();
	}

	public Manager(long empId,String empName,double basic,double allaoance) {
		super(empId,empName,basic);
		this.allaoance = allaoance;
	}

	public double getAllaoance() {
		return allaoance;
	}

	public void setAllaoance(double allaoance) {
		this.allaoance = allaoance;
	}
	

}
