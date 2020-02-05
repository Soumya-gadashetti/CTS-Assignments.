package com.cts.jhpu.ui;

import java.util.TreeSet;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.cts.jhpu.model.Course;
import com.cts.jhpu.model.Trainee;
import com.cts.jhpu.util.JPAUtil;

public class AssoOneToMany {

	public static void main(String[] args) {
		Course mca=new Course(101,"MCA",new TreeSet<Trainee>());
		Course mba=new Course(102,"MBA",new TreeSet<Trainee>());
		mca.getTrainees().add(new Trainee(201,"Soumya",mca));
		mca.getTrainees().add(new Trainee(202,"Meena",mca));
		mca.getTrainees().add(new Trainee(203,"Shruthi",mca));
		
		mba.getTrainees().add(new Trainee(204,"Akshata",mba));
		mba.getTrainees().add(new Trainee(205,"Manasa",mba));
		mba.getTrainees().add(new Trainee(206,"Sachin",mba));
		
		EntityManager em=JPAUtil.getEntityManagerFactory().createEntityManager();
		EntityTransaction txn=em.getTransaction();
		txn.begin();      //to beigin
		em.persist(mca);
		em.persist(mba);
		txn.commit();	//it terminates
		System.out.println("Inserted");
		JPAUtil.shutdown();

	}

}
