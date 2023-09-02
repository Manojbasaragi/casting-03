package com.manoj.CRUD.app.repository;

public class HistoricalPlacesImpl implements HistoricalPlacesRepository {

	String[] places = new String[TOTAL_PLACES];
	int pos;

	@Override
	public void saveData(String place) {
		System.out.println("invoking saveData() in HistoricalPlacesImpl");

		if (this.pos < TOTAL_PLACES) {
			this.places[pos] = place;
			System.out.println(places[pos] + " is stored in position " + pos);
			pos++;
		} else {
			System.err.println("Data store is full, can't store more places");
		}

	}

}
