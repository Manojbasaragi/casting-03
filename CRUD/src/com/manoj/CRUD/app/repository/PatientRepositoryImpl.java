package com.manoj.CRUD.app.repository;

public class PatientRepositoryImpl implements PatientRepository {
	private String[] patients = new String[NO_OF_PATIENTS];
	int pos;
	@Override
	public void saveData(String name) {
		System.out.println("invoking saveData() in PatientRepositoryImpl");
		if (this.pos < NO_OF_PATIENTS) {
			this.patients[pos] = name;
			System.out.println(patients[pos] + " is stored in position " + pos);
			pos++;
		} else {
			System.err.println("Data store is full, can't store more patients");
		}

	}

}
