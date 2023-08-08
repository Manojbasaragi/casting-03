package com.manoj.override.boot;

import com.manoj.override.app.Amoeba;
import com.manoj.override.app.MutantAmoeba;

public class AmoebaRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in AmoebaRunner");

		Amoeba mutantAmoeba = new MutantAmoeba();
		mutantAmoeba.split();

	}

}
