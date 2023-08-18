package com.manoj.Object.boot;

import com.manoj.Object.app.Mechanic;

public class MechanicRunner {
	public static void main(String[] args) {
		System.out.println("invoking main in MechanicRunner");

		Mechanic mechanic = new Mechanic("Ganapa", 40, "Engine", 10, false, 100);
		System.out.println(mechanic);

		Mechanic mechanic1 = new Mechanic("Sanjaya", 28, "wheels", 5, true, 80);
		System.out.println(mechanic1);
		System.out.println("****************************");

		boolean same = mechanic.equals(mechanic1);
		System.out.println("contents are same:" + same);

	}
}
