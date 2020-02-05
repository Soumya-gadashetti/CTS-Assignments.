package com.cts.jhpu.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("empContract")
@Table(name="cemps")
//@Table(name="cemponly")//single per class
public class Contract extends Emp {
	@Column(name="cdur")
 private int duration;

public Contract() {
	super();
}

public Contract(long empNo,String empName,double basic,int duration) {
	super(empNo,empName,basic);
	this.duration = duration;
}

public int getDuration() {
	return duration;
}

public void setDuration(int duration) {
	this.duration = duration;
}
 
 
}
