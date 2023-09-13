package com.jsp.menu;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MenuDelete {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = 
				Persistence.createEntityManagerFactory("tanvi");
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction = entityManager.getTransaction();
		

		Menu menu = entityManager.find(Menu.class, 6);
		
		if(menu != null) {
			entityTransaction.begin();
			entityManager.remove(menu);
			entityTransaction.commit();
		}
		else {
			System.out.println("Not deleted");
		
		}
	
	}
	
}
