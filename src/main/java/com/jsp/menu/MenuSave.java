package com.jsp.menu;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MenuSave {
	
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = 
				Persistence.createEntityManagerFactory("tanvi");
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Menu menu = new Menu();
		
		menu.setName("Mousse Cake");
		menu.setPrice(150);

		entityTransaction.begin();
		entityManager.persist(menu);
		entityTransaction.commit();
		
	}
	
}
