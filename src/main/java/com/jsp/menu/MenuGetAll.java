package com.jsp.menu;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class MenuGetAll {
	
public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = 
				Persistence.createEntityManagerFactory("tanvi");
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Menu menu = entityManager.find(Menu.class, 2);
		
		String sql = "SELECT m FROM Menu m";  // HQL Query
		Query query = entityManager.createQuery(sql); 		// used to create custom query
		
		List<Menu> menus = query.getResultList();	
		
		for(Menu m: menus) {
			System.out.println("================");
			System.out.println(menu.getId());
			System.out.println(menu.getName());
			System.out.println(menu.getPrice());
			System.out.println("================");
		}
		
	}
	
}
