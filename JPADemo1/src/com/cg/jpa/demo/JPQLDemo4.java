package com.cg.jpa.demo;

import javax.management.Query;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
public class JPQLDemo4 {
	public static void main(String args[])
	{
	EntityManagerFactory emf = 
			Persistence.createEntityManagerFactory("JPA-PU");
	EntityManager em = emf.createEntityManager();
	String sql = "update Account acc set acc.balance=acc.balance*1.1";
	em.getTransaction().begin();
	javax.persistence.Query qry=em.createQuery(sql);
	int rows=qry.executeUpdate();
	System.out.println(rows+"updated");
	em.getTransaction().commit();
	
	}
}
