package com.manoj.CRUD.boot;

import com.manoj.CRUD.app.repository.PilotRepository;
import com.manoj.CRUD.app.repository.PilotRepositoryImpl;
import com.manoj.CRUD.app.service.PilotService;
import com.manoj.CRUD.app.service.PilotServiceImpl;

public class PilotServiceRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in PilotServiceRunner");

		PilotRepository pilotRepository = new PilotRepositoryImpl();

		PilotService pilotService = new PilotServiceImpl(pilotRepository);
		pilotService.validateAndService("Kalam");
		System.out.println("*********************");
		pilotService.validateAndService(null);
		System.out.println("*********************");
		pilotService.validateAndService("");

	}

}
