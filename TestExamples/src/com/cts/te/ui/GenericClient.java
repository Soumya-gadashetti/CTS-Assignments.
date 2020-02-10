package com.cts.te.ui;

import com.cts.te.model.GenericClass;

public class GenericClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericClass<String> m=new GenericClass<String>();
		m.add("Soumya");
		System.out.println(m.get());
		GenericClass<String> m1=new GenericClass<String>();
		m1.add("8");
		System.out.println(m1.get());
	}

}
