package com.cts.oopp.ui;

import com.cts.oopd.model.Circle;
import com.cts.oopd.model.Rectangle;
import com.cts.oopd.model.Shape;

public abstract class ShapeClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape shape;
		shape=new Rectangle(10,5);
		System.out.println(shape);
		shape=new Circle(3);
		System.out.println(shape);
	}

}
