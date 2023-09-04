package com.manoj.CRUD.boot;

import com.manoj.CRUD.app.repository.MedicinRepository;
import com.manoj.CRUD.app.repository.MedicineRepositoryImpl;
import com.manoj.CRUD.app.service.MedicineService;
import com.manoj.CRUD.app.service.MedicineServiceImpl;

public class MedicineServiceRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in MedicineServiceRunner");

		MedicinRepository medicinRepository = new MedicineRepositoryImpl();

		MedicineService medicineService = new MedicineServiceImpl(medicinRepository);
		medicineService.validateAndSave("Amlodipin");
		System.out.println("*************************");
		medicineService.validateAndSave(null);
		System.out.println("*************************");
		medicineService.validateAndSave("");

	}

}
