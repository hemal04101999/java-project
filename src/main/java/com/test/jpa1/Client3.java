package com.test.jpa1;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client3 {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		Employee e=new Employee();
		Address ad=new Address();
		ad.setCity("mum");
		ad.setState("maharashtra");
		ad.setStreet("lane1");
		ad.setPincode(421306);
		
		e.setAddress(ad);
		e.setDOJ(new Date());
		e.setName("Hemal");
		e.setSalary(20000);
		em.persist(e);
		em.getTransaction().commit();
		em.close();
		factory.close();

	}

}
