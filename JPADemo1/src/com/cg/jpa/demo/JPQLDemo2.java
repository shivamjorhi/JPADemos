package com.cg.jpa.demo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class JPQLDemo2 {

	public static void main(String args[])
	{
	EntityManagerFactory emf = 
			Persistence.createEntityManagerFactory("JPA-PU");
	EntityManager em = emf.createEntityManager();
	
	String sql="select acc.balance from Account acc where acc.balance>40000";
			TypedQuery<Double> tq = em.createQuery(sql,Double.class);
	
	List<Double> balancelist=tq.getResultList();
	System.out.println(balancelist);
}
}