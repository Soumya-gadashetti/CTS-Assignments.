package com.cts.se.SpriEx;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Engineer eng=context.getBean("theengineer",Engineer.class);
		eng.work();
	}

}
