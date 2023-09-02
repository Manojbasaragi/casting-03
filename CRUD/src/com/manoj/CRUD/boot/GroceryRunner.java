package com.manoj.CRUD.boot;

import com.manoj.CRUD.app.repository.GroceryRepository;
import com.manoj.CRUD.app.repository.GroceryRepositoryImpl;

public class GroceryRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in GroceryRunner");

		GroceryRepository grocery = new GroceryRepositoryImpl();
		grocery.save("Rice");
		grocery.save("Milk");
		grocery.save("Wheet");
		grocery.save("Onion");
		grocery.save("Oil");
		grocery.save("Biscuit");
		grocery.save("Brijoil");
		grocery.save("Sugar");
		grocery.save("Tomoto");
		grocery.save("Chilli");
	}

}
