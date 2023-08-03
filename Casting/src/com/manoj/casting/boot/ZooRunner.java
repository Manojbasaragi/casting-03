package com.manoj.casting.boot;

import com.manoj.casting.app.zoo.NationalZoo;
import com.manoj.casting.app.zoo.StateZoo;
import com.manoj.casting.app.zoo.Zoo;
import com.manoj.casting.app.zoo.ZooUtil;

public class ZooRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in ZooRunner");
		Zoo zoo = new StateZoo();
		// or Zoo zoo = new NationalZoo();
		System.out.println(zoo.isItLarge);
		zoo.enjoy();

		StateZoo stateZoo = (StateZoo) zoo;
		// or NationalZoo nationalZoo = (NationalZoo)zoo;
		ZooUtil.run();

	}

}
