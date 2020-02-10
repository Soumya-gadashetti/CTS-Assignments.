package com.cts.oopd.model;

public class Rectangle extends Shape {

	public Rectangle() {
		super();
	}

	public Rectangle(double x) {
		super(x);
		// TODO Auto-generated constructor stub
	}

	public Rectangle(double x, double y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double area() {
		
		return x*y;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 2*(x+y);
	}

}
