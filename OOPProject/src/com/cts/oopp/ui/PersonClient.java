package com.cts.oopp.ui;

import com.cts.oopd.model.Employee;
import com.cts.oopd.model.ManagerEm;
import com.cts.oopd.model.StudentHier;

public class PersonClient {

	public static void main(String[] args) {
		Employee employee=new Employee();
		employee.setName("Soumya");
		employee.setAge(30);
		employee.setSalary(30000);
		System.out.println(employee);
		
		StudentHier studentss=new StudentHier();
		studentss.setName("Meens");
		studentss.setAge(30);
		studentss.setFeePaid(6000);
		System.out.println(studentss);
		
		ManagerEm manager=new ManagerEm();
		manager.setName("Pushpa");
		manager.setAge(30);
		manager.setSalary(30000);
		manager.setBonus(10000);
		System.out.println(manager);
		
		
		
	}

}
