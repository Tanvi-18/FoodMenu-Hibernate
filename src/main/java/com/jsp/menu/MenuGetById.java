package com.jsp.menu;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MenuGetById {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = 
				Persistence.createEntityManagerFactory("tanvi");
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Menu menu = entityManager.find(Menu.class, 2);
		
		
		System.out.println(menu.getId());
		System.out.println(menu.getName());
		System.out.println(menu.getPrice());	
	
		
	}
	
}
