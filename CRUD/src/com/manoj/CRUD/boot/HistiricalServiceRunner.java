package com.manoj.CRUD.boot;

import com.manoj.CRUD.app.repository.HistoricalPlacesImpl;
import com.manoj.CRUD.app.repository.HistoricalPlacesRepository;
import com.manoj.CRUD.app.service.HistoricalService;
import com.manoj.CRUD.app.service.HistoriclPlaceServiceImpl;

public class HistiricalServiceRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in HistiricalServiceRunner");

		HistoricalPlacesRepository historicalPlacesRepository = new HistoricalPlacesImpl();

		HistoricalService historicalService = new HistoriclPlaceServiceImpl(historicalPlacesRepository);
		historicalService.validateAndSave("Sakaleshpur");
		System.out.println("*********************");
		historicalService.validateAndSave(null);
		System.out.println("*********************");
		historicalService.validateAndSave("");

	}

}
