package com.manoj.casting.app.zoo;

public class ZooUtil {

	public static void run() {
		System.out.println("invoking run() in ZooUtil");

		Zoo zoo = new StateZoo();
		// or Zoo zoo = new NationalZoo();
		System.out.println(zoo.isItLarge);
		zoo.enjoy();

		if (zoo instanceof StateZoo) {
			StateZoo stateZoo = (StateZoo) zoo;
			System.out.println(stateZoo.stateName);
			stateZoo.entry();
		}
		if (zoo instanceof NationalZoo) {
			NationalZoo nationalZoo = (NationalZoo) zoo;
			System.out.println(nationalZoo.name);
			nationalZoo.exit();
		}
	}

}
