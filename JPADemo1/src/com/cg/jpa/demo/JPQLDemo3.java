package com.cg.jpa.demo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class JPQLDemo3 {
	public static void main(String args[])
	{
	EntityManagerFactory emf = 
			Persistence.createEntityManagerFactory("JPA-PU");
	EntityManager em = emf.createEntityManager();
	
	String sql="select max(acc.balance) from Account acc";
			TypedQuery<Double> tq = em.createQuery(sql,Double.class);
			double maxbal = tq.getSingleResult();
	
	System.out.println("highest balance :"+maxbal);
}

}
