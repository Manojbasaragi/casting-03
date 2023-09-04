package com.manoj.CRUD.boot;

import com.manoj.CRUD.app.repository.PatientRepository;
import com.manoj.CRUD.app.repository.PatientRepositoryImpl;
import com.manoj.CRUD.app.service.PatientService;
import com.manoj.CRUD.app.service.PatientServiceImpl;

public class PatientServiceRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in PatientServiceRunner");

		PatientRepository patientRepository = new PatientRepositoryImpl();

		PatientService patientService = new PatientServiceImpl(patientRepository);
		patientService.validateAndSave("Ravi");
		patientService.validateAndSave(null);
		patientService.validateAndSave("");

	}

}
