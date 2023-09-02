package com.manoj.CRUD.app.repository;

public class JacketRepositoryImpl implements JacketRepository {

	private String[] jackets = new String[TOTAL_JACKETS];
	int pos;

	@Override
	public void save(String jacket_name) {
		System.out.println("invoking save() in JacketRepositoryImpl");

		if (this.pos < TOTAL_JACKETS) {
			this.jackets[pos] = jacket_name;
			System.out.println(jackets[pos] + " is stored in position " + pos);
			pos++;
		} else {
			System.err.println("Data store is full, can't store more jackets");
		}
	}

}
