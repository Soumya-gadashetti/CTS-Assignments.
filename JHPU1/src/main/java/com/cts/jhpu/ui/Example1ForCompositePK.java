package com.cts.jhpu.ui;

import java.util.Date;

import javax.persistence.EntityManager;

import com.cts.jhpu.model.Student;
import com.cts.jhpu.model.StudentIdentity;
import com.cts.jhpu.util.JPAUtil;

public class Example1ForCompositePK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student(new StudentIdentity(1,'A',7),"Soumya","Aripika",new Date(1997,5,5));
		EntityManager em=JPAUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.persist(s);
		em.getTransaction().commit();
		System.out.println("Student Saved!");
		JPAUtil.shutdown();

	}

}
