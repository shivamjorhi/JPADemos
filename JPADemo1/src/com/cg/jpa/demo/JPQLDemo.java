package com.cg.jpa.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.jpa.entity.Account;

public class JPQLDemo {
	public static void main(String args[])
	{
	EntityManagerFactory emf = 
			Persistence.createEntityManagerFactory("JPA-PU");
	EntityManager em = emf.createEntityManager();
	
	Account ac1 = new Account();
	ac1.setAccHolderName("Nikhil");
	ac1.setBalance(45000);
	ac1.setMobileNo("91204320324");
	
	Account ac2 = new Account();
	ac2.setAccHolderName("Ajay");
	ac2.setBalance(34000);
	ac2.setMobileNo("32435131");
	
	Account ac3 = new Account();
	ac3.setAccHolderName("Vidya");
	ac3.setBalance(36000);
	ac3.setMobileNo("35030322");
	
	Account ac4 = new Account();
	ac4.setAccHolderName("Vishaka");
	ac4.setBalance(45000);
	ac4.setMobileNo("920302322");
	
	em.getTransaction().begin();
	em.persist(ac1);
	em.persist(ac2);
	em.persist(ac3);
	em.persist(ac4);
	em.getTransaction().commit();
	
	System.out.println("Accounts added...");
	
	
	
	
	
	
}
}
