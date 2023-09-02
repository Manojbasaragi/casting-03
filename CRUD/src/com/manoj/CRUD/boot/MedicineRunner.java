package com.manoj.CRUD.app.repository;

public class MedicineRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in MedicineRunner");

		MedicinRepository medicinRepository = new MedicineRepositoryImpl();
		medicinRepository.save("Atripla");
		medicinRepository.save("Biktarvy");
		medicinRepository.save("Eviplera");
		medicinRepository.save("Delstrigo");
		medicinRepository.save("Dovato");
		medicinRepository.save("Juluca");
		medicinRepository.save("Amlodipin");
		medicinRepository.save("Adderall");
		medicinRepository.save("Atorvastatin");
		medicinRepository.save("Lisinopril");

	}

}
