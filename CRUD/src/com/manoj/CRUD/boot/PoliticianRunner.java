package com.manoj.CRUD.boot;

import com.manoj.CRUD.app.repository.PoliciticianRepository;
import com.manoj.CRUD.app.repository.PoliticianRepositoryImpl;

public class PoliticianRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in PoliticianRunner");
		
		PoliciticianRepository policiticianRepository = new PoliticianRepositoryImpl();
		policiticianRepository.saveData("Narendra modi");
		policiticianRepository.saveData("Kejriwal");
		policiticianRepository.saveData("Yadiyurappa");
		policiticianRepository.saveData("KumarSwami");
		policiticianRepository.saveData("Devaraj Aras");
		policiticianRepository.saveData("Siddaramiah");
		policiticianRepository.saveData("Devegowda");
		policiticianRepository.saveData("Jagadish Shettar");
		policiticianRepository.saveData("S.M.Krishna");
		policiticianRepository.saveData("KC Reddy");

	}

}
