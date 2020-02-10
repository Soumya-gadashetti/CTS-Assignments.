package com.cts.se.SpriEx;



public class Engineer {
	private String name;
	private int id;
	public Engineer(String name,int id) {
		this.name=name;
		this.id=id;
	}
	void work() {
		System.out.println("Engineer Details: Name"+ this.getName()+ " "+"ID"+this.getId());
	}
	public String getName() {
		return name;
	}

	/*
	 * public void setName(String name) { this.name = name; }
	 */
	public int getId() {
		return id;
	}
	/*
	 * public void setId(int id) { this.id = id; }
	 */
}
