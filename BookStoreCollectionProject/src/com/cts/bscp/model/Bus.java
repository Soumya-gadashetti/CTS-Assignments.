package com.cts.bscp.model;

import java.io.Serializable;
import java.time.LocalDate;
 
/*
 * Represents a Bus in a library or Bus store.
 */
@SuppressWarnings("serial")
public class Bus implements Serializable /* implements Comparable<Bus> */ {

	private String bcode;
	private String title;
	private LocalDate arrivalDate;
	private double price;

	public Bus() {
		/* default constructor */
	}

	public Bus(String bcode, String title, LocalDate arrivalDate, double price) {
		super();
		this.bcode = bcode;
		this.title = title;
		this.arrivalDate = arrivalDate;
		this.price = price;
	}

	public String getBcode() {
		return bcode;
	}

	public void setBcode(String bcode) {
		this.bcode = bcode;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public LocalDate getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(LocalDate arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		StringBuilder output = new StringBuilder("Bus Code : ");
		output.append(bcode);
		output.append("\tTitle : ");
		output.append(title);
		output.append("\tPublish Date :");
		output.append(arrivalDate);
		output.append("\tPrice : ");
		output.append(price);
		return output.toString();
	}

	/*
	 * @Override public int compareTo(Bus Bus) { String firstBCode = this.bcode;
	 * String secondBCode = Bus.bcode; return firstBCode.compareTo(secondBCode); }
	 * 
	 * @Override public int hashCode() { int hashCode =0;
	 * 
	 * char[] chars = bcode.toCharArray(); for(int i=1;i<=chars.length;i++){
	 * hashCode += ((int)chars[i-1])*i; }
	 * 
	 * return hashCode; }
	 * 
	 * @Override public boolean equals(Object obj) { boolean flag = false;
	 * 
	 * if (obj instanceof Bus) { Bus Bus = (Bus)obj; String firstBCode =
	 * this.bcode; String secondBCode = Bus.bcode; flag=
	 * firstBCode.equals(secondBCode); }
	 * 
	 * return flag; }
	 */
}
