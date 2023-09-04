package com.manoj.CRUD.app.service;

import com.manoj.CRUD.app.repository.HistoricalPlacesRepository;

public class HistoriclPlaceServiceImpl implements HistoricalService {

	private HistoricalPlacesRepository historicalPlacesRepository;

	public HistoriclPlaceServiceImpl(HistoricalPlacesRepository historicalPlacesRepository) {
		this.historicalPlacesRepository = historicalPlacesRepository;
	}

	@Override
	public boolean validateAndSave(String place) {
		System.out.println("invoking validateAndSave in HistoriclPlaceServiceImpl ");
		if (place != null && !place.isEmpty() && place.length() > 3 && place.length() < 20) {
			System.out.println("Data is valid");
			this.historicalPlacesRepository.saveData(place);
		} else {
			System.err.println("Data is invalid");
		}

		return false;
	}

}
