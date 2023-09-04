package com.manoj.CRUD.app.service;

import com.manoj.CRUD.app.repository.ArtistRepository;

public class ArtistServiceImpl implements ArtistService {

	private ArtistRepository artistRepository;

	public ArtistServiceImpl(ArtistRepository artistRepository) {
		this.artistRepository = artistRepository;
	}

	@Override
	public boolean validateAndSave(String name) {
		System.out.println("invoking validateAndSave in ArtistServiceImpl");
		if (name != null && !name.isEmpty() && name.length() > 3 && name.length() < 20) {
			System.out.println("Data is valid");
			this.artistRepository.save(name);
		} else {
			System.err.println("Data is invalid!!");
		}
		return false;
	}

}
