package com.manoj.CRUD.app.service;

import com.manoj.CRUD.app.repository.MedicinRepository;

public class MedicineServiceImpl implements MedicineService {

	private MedicinRepository medicinRepository;

	public MedicineServiceImpl(MedicinRepository medicinRepository) {
		this.medicinRepository = medicinRepository;
	}

	@Override
	public boolean validateAndSave(String medicineName) {
		System.out.println("invoking validateAndSave in MedicineServiceRunner");

		if (medicineName != null && !medicineName.isEmpty() && medicineName.length() > 3
				&& medicineName.length() < 20) {
			System.out.println("Data is valid");
			this.medicinRepository.save(medicineName);
		} else {
			System.err.println("Data is invalid");
		}
		return false;
	}

}
