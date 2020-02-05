package com.cts.jhpu.ui;
import java.util.Scanner;

import javax.persistence.EntityManager;

import com.cts.jhpu.util.JPAUtil;

public class Example1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Employee e=new Employee();
		System.out.println("EmpId");
		e.setEmpId(sc.nextInt());
		System.out.println("EmpName");
		e.setEmpName(sc.next());
		System.out.println("Basic");
		e.setBasic(sc.nextDouble());
		
		EntityManager em=JPAUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.persist(e);
		em.getTransaction().commit();
		System.out.println("Emp Saved");
		JPAUtil.shutdown();
	}

}
