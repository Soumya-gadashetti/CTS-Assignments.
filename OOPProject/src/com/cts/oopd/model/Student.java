package com.cts.oopd.model;

public class Student {
	private int rollNumber;
	String name;
	private static String course;
	private static int feePaid;
	public Student()
	{
//		no specific implimentation
		
	}
	public Student(int rollNumber,String name) {
		this.rollNumber=rollNumber;
		this.name=name;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber=rollNumber;
	}
	public int getRollNumber() {
		return this.rollNumber;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
	public static void setCourse(String newCourse) {
		course=newCourse;
	}
	public static String getCourse() {
		return course;
	}
	public static void setFeePaid(int fee) {
		feePaid=fee;
	}
	public static int getFeePaid() {
		return feePaid;
	}
	
	public void show() {
		System.out.println(rollNumber+","+name+","+course+","+feePaid);
	}
	
	

}
