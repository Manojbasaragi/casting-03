package com.manoj.CRUD.app.repository;

public class PoliticianRepositoryImpl implements PoliciticianRepository {

	private String[] politicians = new String[TOTAL_POLITICIAN];
	int pos;

	@Override
	public void saveData(String politician) {
		System.out.println("invoking saveData() in PoliticianRepositoryImpl");

		if (this.pos < TOTAL_POLITICIAN) {
			this.politicians[pos] = politician;
			System.out.println(politicians[pos] + " is stored in position " + pos);
			pos++;
		} else {
			System.err.println("Data store is full, can't store more politicians");
		}

	}

}
