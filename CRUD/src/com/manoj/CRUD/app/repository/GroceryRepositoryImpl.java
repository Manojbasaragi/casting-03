package com.manoj.CRUD.app.repository;

public class GroceryRepositoryImpl implements GroceryRepository {
	private String[] groceries = new String[TOTAL_ITEMS];
	int pos;

	@Override
	public void save(String grocery) {
		System.out.println("invoking save() in GroceryRepositoryImpl");
		if (this.pos < TOTAL_ITEMS) {
			this.groceries[pos] = grocery;
			System.out.println(groceries[pos] + " is stored in position " + pos);
			pos++;
		} else {
			System.err.println("Data store is full, can't store more groceries");
		}

	}

}
