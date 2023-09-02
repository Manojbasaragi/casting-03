package com.manoj.CRUD.app.repository;

public class MedicineRepositoryImpl implements MedicinRepository {
	private String[] artiests = new String[NO_OF_MEDICINES];
	int pos;

	@Override
	public void save(String medicine_name) {
		System.out.println("invoking save() in MedicineRepositoryImpl");
		if (this.pos < NO_OF_MEDICINES) {
			this.artiests[pos] = medicine_name;
			System.out.println(artiests[pos] + " is stored in position " + pos);
			pos++;
		} else {
			System.err.println("Data store is full, can't store more medicins");
		}

	}

}
