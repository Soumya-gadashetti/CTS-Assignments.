package com.cts.oopd.model;

public class ManagerEm extends Employee {
	private int bonus;
	public ManagerEm() {
		super();
	}
	public ManagerEm(String name,int age,int salary,int bonus) {
		super(name,age,salary);
		this.bonus=bonus;
	}
	public void setBonus(int bonus) {
		this.bonus=bonus;
	}
	public int getBonus() {
		return this.bonus;
	}
	@Override
	public String toString() {
		return super.toString()+ "," +bonus;
	}
}
