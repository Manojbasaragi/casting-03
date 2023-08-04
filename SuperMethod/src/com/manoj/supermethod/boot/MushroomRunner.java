package com.manoj.supermethod.boot;

import com.manoj.supermethod.app.PoisonMushroom;

public class MushroomRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in MushroomRunner ");

		PoisonMushroom poisonMushroom = new PoisonMushroom();
		System.out.println(poisonMushroom.name);
		System.out.println(poisonMushroom.edible);
		System.out.println(poisonMushroom.habitat);
		System.out.println(poisonMushroom.weightInGrams);

		System.out.println("*****************************");

		PoisonMushroom poisonMushroom2 = new PoisonMushroom("Cutubas",false,30,"Wet Forests");
		System.out.println(poisonMushroom2.name);
		System.out.println(poisonMushroom2.edible);
		System.out.println(poisonMushroom2.habitat);
		System.out.println(poisonMushroom2.weightInGrams);

	}

}
