package com.manoj.CRUD.boot;

import com.manoj.CRUD.app.repository.ArtistRepository;
import com.manoj.CRUD.app.repository.ArtistRepositoryImpl;

public class ArtistRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in ArtistRunner");

		ArtistRepository artistRepository = new ArtistRepositoryImpl();
		artistRepository.save("Manoj");
		artistRepository.save("Bharat");
		artistRepository.save("Krishna");
		artistRepository.save("Prabhu");
		artistRepository.save("Narayan");
		artistRepository.save("Shivaraj");
		artistRepository.save("Roopesh");
		artistRepository.save("Karant");
		artistRepository.save("Shravan");
		artistRepository.save("Rahul");

	}

}
