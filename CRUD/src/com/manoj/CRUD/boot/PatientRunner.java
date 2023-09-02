package com.manoj.CRUD.boot;

import com.manoj.CRUD.app.repository.PatientRepository;
import com.manoj.CRUD.app.repository.PatientRepositoryImpl;

public class PatientRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in PatientRunner");

		PatientRepository patientRepository = new PatientRepositoryImpl();
		patientRepository.saveData("Sanjaya");
		patientRepository.saveData("Ganap");
		patientRepository.saveData("Anil");
		patientRepository.saveData("Manju");
		patientRepository.saveData("Parasu");
		patientRepository.saveData("Karthik");
		patientRepository.saveData("Jagan");
		patientRepository.saveData("Sagar");
		patientRepository.saveData("Sachine");
		patientRepository.saveData("Rohit");
	}

}
