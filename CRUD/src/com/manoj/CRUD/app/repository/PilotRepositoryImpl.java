package com.manoj.CRUD.app.repository;

public class PilotRepositoryImpl implements PilotRepository {

	String[] pilots = new String[TOTAL_PILOTS];
	int pos;

	@Override
	public void saveData(String pilotName) {
		System.out.println("invoking saveData() in PilotRepositoryImpl");

		if (this.pos < TOTAL_PILOTS) {
			this.pilots[pos] = pilotName;
			System.out.println(pilots[pos] + " is stored in position " + pos);
			pos++;
		} else {
			System.out.println("Data store is full, can't store more pilots");
		}

	}

}
