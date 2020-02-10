package com.cts.oopp.ui;

import com.cts.oopd.model.Complex;

public class ComplexClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complex first=new Complex();
		first.show();
		Complex second=new Complex(3,-2);
		second.show();
		if(first==second)
			System.out.println("Equal");
		else
			System.out.println("not equal");
		Complex result=first.add(second);
		result.show();
		Complex third=second;
		third.show();
		if(second==third) {
			System.out.println("second and third are equal");
		}
		else
				System.out.println("second and third are not equal");
		}
	}


