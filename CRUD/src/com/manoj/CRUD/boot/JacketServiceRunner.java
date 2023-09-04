package com.manoj.CRUD.boot;

import com.manoj.CRUD.app.repository.JacketRepository;
import com.manoj.CRUD.app.repository.JacketRepositoryImpl;
import com.manoj.CRUD.app.service.JacketService;
import com.manoj.CRUD.app.service.JacketServiceImpl;

public class JacketServiceRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in JacketServiceRunner");

		JacketRepository jacketRepository = new JacketRepositoryImpl();

		JacketService jacketService = new JacketServiceImpl(jacketRepository);
		jacketService.validateAndSave("Daniem Jacket");
		System.out.println("***********************");
		jacketService.validateAndSave(null);
		System.out.println("***********************");
		jacketService.validateAndSave("");

	}

}
