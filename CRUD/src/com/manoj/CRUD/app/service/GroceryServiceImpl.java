package com.manoj.CRUD.app.service;

import com.manoj.CRUD.app.repository.GroceryRepository;

public class GroceryServiceImpl implements GroceryService {

	private GroceryRepository groceryRepository;

	public GroceryServiceImpl(GroceryRepository groceryRepository) {
		this.groceryRepository = groceryRepository;
	}

	@Override
	public boolean validateAndSave(String grocery) {
		System.out.println("invoking validateAndSave in GroceryServiceImpl");

		if (grocery != null && !grocery.isEmpty() && grocery.length() > 3 && grocery.length() < 20) {
			System.out.println("Data is valid");
			this.groceryRepository.save(grocery);
		} else {
			System.err.println("Data is not valid");
		}
		return false;
	}

}
