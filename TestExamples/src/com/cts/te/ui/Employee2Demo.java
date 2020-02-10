package com.cts.te.ui;
import java.io.IOException;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.ObjectOutputStream;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
//import java.util.Set;
//import java.util.TreeSet;

//import com.cts.te.model.Employee2;

public class Employee2Demo {

	public static void main(String[] args) throws IOException {
		int empid = 0;
		String empname;
		//LocalDate dob;
		DateTimeFormatter dateFormatter ;
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter the Employeeid:");
		empid=sc.nextInt();
		System.out.println("Enter the Employee name:");
		empname=sc.nextLine();
		System.out.println("Enter the Date of Birth of the Employee in the format(yyyy-mm-dd");
		dateFormatter=DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		
			
		
//		ObjectOutputStream oout=null;
//		try {
//			FileOutputStream out=new FileOutputStream("output.txt");
//			oout=new ObjectOutputStream(out);
//			
//			Set<Employee2> pq = new TreeSet<Employee2>();
//			Employee2 e1 = new Employee2(101,"Nandini",LocalDate.of(1994,1, 27));
//			pq.add(e1); 
//			Employee2 e2 = new Employee2(102,"Anmol",LocalDate.of(1969, 10, 7)); 
//			pq.add(e2);          
//			Employee2 e3 = new Employee2(103,"Palak",LocalDate.of(1999, 05, 26)); 
//			pq.add(e3); 
//			System.out.println("Employees served in their age order");
//			oout.writeObject(e1);
//			oout.writeObject(e2);
//			oout.writeObject(e3);
//			for(Employee2 emp: pq) {
//				System.out.println(emp.getEmpName());
//				
//			}
//			oout.close();
//		}catch(DateTimeException exep) {
//			exep.printStackTrace();
//		}
//		
}
}