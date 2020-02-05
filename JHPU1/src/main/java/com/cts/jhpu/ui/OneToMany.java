package com.cts.jhpu.ui;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.cts.jhpu.model.BankAccount;
import com.cts.jhpu.model.Customer;
import com.cts.jhpu.util.JPAUtil;

public class OneToMany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount ba=new BankAccount();
		Customer c=new Customer("1111222233","Soumya1",ba);
		ba.setAccno("HD102");
		ba.setCustomer(c);
//		/*
//		 * ba.setAccno("HDFC101"); ba.setCustomer(c);
//		 */
		
		EntityManager em=JPAUtil.getEntityManagerFactory().createEntityManager();
		EntityTransaction txn=em.getTransaction();
		txn.begin();
		em.persist(c);
		txn.commit();
		System.out.println("Inserted");
		JPAUtil.shutdown();
	}

}
