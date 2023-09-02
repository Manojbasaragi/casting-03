package com.manoj.CRUD.boot;

import com.manoj.CRUD.app.repository.JacketRepository;
import com.manoj.CRUD.app.repository.JacketRepositoryImpl;

public class JacketRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in JacketRunner");

		JacketRepository jacketRepository = new JacketRepositoryImpl();
		jacketRepository.save("Denim Jacket");
		jacketRepository.save("Imsulated Vest Jacket");
		jacketRepository.save("Versity Jacket");
		jacketRepository.save("Fleece Jacket");
		jacketRepository.save("SXJ Jacket");
		jacketRepository.save("Motorcycle Jacket");
		jacketRepository.save("Racer Jacket");
		jacketRepository.save("Flight Jacket");
		jacketRepository.save("Blouson Jacket");
		jacketRepository.save("Wool Car Jacket");

	}

}
