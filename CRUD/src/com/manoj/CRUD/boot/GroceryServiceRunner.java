package com.manoj.CRUD.boot;

import com.manoj.CRUD.app.repository.GroceryRepository;
import com.manoj.CRUD.app.repository.GroceryRepositoryImpl;
import com.manoj.CRUD.app.service.GroceryService;
import com.manoj.CRUD.app.service.GroceryServiceImpl;

public class GroceryServiceRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in GroceryServiceRunner");

		GroceryRepository groceryRepository = new GroceryRepositoryImpl();

		GroceryService groceryService = new GroceryServiceImpl(groceryRepository);
		groceryService.validateAndSave("");
		System.out.println("************************");
		groceryService.validateAndSave("Onion");
		System.out.println("************************");
		groceryService.validateAndSave(null);

	}

}
