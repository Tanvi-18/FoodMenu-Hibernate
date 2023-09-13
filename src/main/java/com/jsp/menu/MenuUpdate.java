package com.jsp.menu;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MenuUpdate {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = 
				Persistence.createEntityManagerFactory("tanvi");
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Menu menu = entityManager.find(Menu.class, 2);
		
		menu.setPrice(200);

		entityTransaction.begin();
		entityManager.persist(menu);
		entityTransaction.commit();
		
		
	}
	
}
