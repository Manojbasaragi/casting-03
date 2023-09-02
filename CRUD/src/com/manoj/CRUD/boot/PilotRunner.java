package com.manoj.CRUD.boot;

import com.manoj.CRUD.app.repository.PilotRepository;
import com.manoj.CRUD.app.repository.PilotRepositoryImpl;

public class PilotRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in PilotRunner");

		PilotRepository pilotRepository = new PilotRepositoryImpl();
		pilotRepository.saveData("Manjunath");
		pilotRepository.saveData("Manoj");
		pilotRepository.saveData("Mahesh");
		pilotRepository.saveData("Lohit");
		pilotRepository.saveData("Kalam");
		pilotRepository.saveData("Ashfaq");
		pilotRepository.saveData("Sagar");
		pilotRepository.saveData("Sachine");
		pilotRepository.saveData("Manikant");
		pilotRepository.saveData("Ravi");

	}

}
