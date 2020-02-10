package com.cts.oopd.model;

public class StudentHier extends Person {
	private int feePaid;
	public StudentHier() {
		super();
	}
	public StudentHier(String name,int age,int feePaid) {
		super(name,age);
		this.feePaid=feePaid;
	}
	public void setFeePaid(int feePaid) {
		this.feePaid=feePaid;
	}
	public int getFeePaid() {
		return this.feePaid;
	}
	@Override
	public String toString() {
		return super.toString()+"," +feePaid;
	}
}
