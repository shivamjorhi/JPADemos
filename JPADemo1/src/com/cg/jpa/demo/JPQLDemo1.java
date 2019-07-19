package com.cg.jpa.demo;

import java.util.List;

import javax.management.Query;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.cg.jpa.entity.Account;

public class JPQLDemo1 {
	
	public static void main(String args[])
	{
	EntityManagerFactory emf = 
			Persistence.createEntityManagerFactory("JPA-PU");
	EntityManager em = emf.createEntityManager();
	
	
	 TypedQuery<String> query = em.createNamedQuery("getNames", String.class);
	 query.setParameter("b1", 30000.00);
	 query.setParameter("b2", 40000.00);
	 
	 List<String>namelist=query.getResultList();
	 for(String name:namelist)
	 {
	  System.out.println(name);
	 } 



}
}
