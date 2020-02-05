package com.cts.jhpu.ui;

import javax.persistence.EntityManager;

import com.cts.jhpu.model.Contract;
import com.cts.jhpu.model.Emp;
import com.cts.jhpu.model.Manager;
import com.cts.jhpu.util.JPAUtil;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp e=new Emp(104,"Soumya",1000);
		Contract c=new Contract(105,"Meena",10000,14);
		Manager m=new Manager(106,"Shruthi",12000,1000);
		EntityManager em=JPAUtil.getEntityManagerFactory().createEntityManager();
		
		em.getTransaction().begin();
		em.persist(e);
		em.persist(c);
		em.persist(m);
		em.getTransaction().commit();
		System.out.println("All records inserted");
		JPAUtil.shutdown();
		

	}

}
