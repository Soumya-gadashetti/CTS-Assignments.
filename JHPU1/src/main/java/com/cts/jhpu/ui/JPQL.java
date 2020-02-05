package com.cts.jhpu.ui;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.cts.jhpu.util.JPAUtil;

public class JPQL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManager em=JPAUtil.getEntityManagerFactory().createEntityManager();
		Employee emp=em.find(Employee.class, 101);
		if(emp!=null) {
			System.out.println(emp);
		}
		String qryString="SELECT e FROM Employee e";
		Query qry=em.createQuery(qryString);
		
		display(qry.getResultList());
		display(em.createQuery("SELECT e FROM Employee e WHERE e.basic>2000").getResultList());
		
		List<String> names=em.createQuery("SELECT e.empName FROM Employee e").getResultList();
		for(String n:names) {
			System.out.println("The Employee Name is "+n);
			//e
		}
		em.close();
		JPAUtil.shutdown();
	}
	static void display(List<Employee> data) {
		System.out.println("-----------------------------");
		for(Employee a:data) {
			System.out.println(a);
		}
	}

//	private static void display(List resultList) {
//		// TODO Auto-generated method stub
//		
//	}

}
