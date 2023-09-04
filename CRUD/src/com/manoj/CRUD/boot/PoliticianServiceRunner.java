package com.manoj.CRUD.boot;

import com.manoj.CRUD.app.repository.PoliciticianRepository;
import com.manoj.CRUD.app.repository.PoliticianRepositoryImpl;
import com.manoj.CRUD.app.service.PoliticianService;
import com.manoj.CRUD.app.service.PoliticianServiceImpl;

public class PoliticianServiceRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in PoliticianServiceRunner");

		PoliciticianRepository policiticianRepository = new PoliticianRepositoryImpl();

		PoliticianService politicianService = new PoliticianServiceImpl(policiticianRepository);
		politicianService.validateAndSave("Modi");
		System.out.println("*****************");
		politicianService.validateAndSave(null);
		System.out.println("*****************");
		politicianService.validateAndSave("");

	}

}
