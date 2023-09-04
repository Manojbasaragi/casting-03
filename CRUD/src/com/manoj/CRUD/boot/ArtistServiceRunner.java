package com.manoj.CRUD.boot;

import com.manoj.CRUD.app.repository.ArtistRepository;
import com.manoj.CRUD.app.repository.ArtistRepositoryImpl;
import com.manoj.CRUD.app.service.ArtistService;
import com.manoj.CRUD.app.service.ArtistServiceImpl;

public class ArtistServiceRunner {
	public static void main(String[] args) {
		System.out.println("invoking main in ArtistServiceRunner");

		ArtistRepository artistRepository = new ArtistRepositoryImpl();

		ArtistService artistService = new ArtistServiceImpl(artistRepository);
		artistService.validateAndSave("S.Narayan");
		System.out.println("***********************");
		artistService.validateAndSave("");
		System.out.println("***********************");
		artistService.validateAndSave(null);
	}

}
