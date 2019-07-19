package com.cg.jpa.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.jpa.entity.Student;

public class ClientClass {

	public static void main(String args[]) {
		EntityManagerFactory emf = 
				Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = emf.createEntityManager();
		/*em.getTransaction().begin();
		Student s1 = new Student();
		s1.setName("Amit");
		s1.setEmailid("amit@gmail.com");
		em.persist(s1);
		em.flush();
		System.out.println("Record Added :"+s1.getRollno());
		em.getTransaction().commit();*/
		
		/*Student s2 = em.find(Student.class, 10);
		System.out.println(s2.getRollno());
		System.out.println(s2.getEmailid());
		System.out.println(s2.getName());*/
		
		
		//updating Record
		/*Student s3 = new  Student();
		s3.setRollno(1);
		s3.setName("Amit");
		s3.setEmailid("Amit123@gmail.com");
		em.getTransaction().begin();
		em.merge(s3);
		System.out.println("Record updated...");
		em.getTransaction().commit();*/
		
		//deleting record
		Student s4 = em.find(Student.class,10);
		em.getTransaction().begin();
		em.remove(s4);
		System.out.println("Record deletd...");
		em.getTransaction().commit();
	}
	
}
