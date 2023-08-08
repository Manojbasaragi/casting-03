package com.manoj.override.boot;

import com.manoj.override.app.Coal;
import com.manoj.override.app.Material;

public class CoalRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in CoalRunner");

		Coal material = new Material();
		material.burn();

	}

}
