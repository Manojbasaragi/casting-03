package com.manoj.override.app;

public class MutantAmoeba extends Amoeba {
	@Override
	public void split() {
		System.out.println("invoking split method in MutantAmoeba");
	}

}
