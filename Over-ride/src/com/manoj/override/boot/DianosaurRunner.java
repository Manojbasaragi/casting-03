package com.manoj.override.boot;

import com.manoj.override.app.Dianosaur;
import com.manoj.override.app.Tyrannosaur;

public class DianosaurRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in DianosaurRunner");

		Dianosaur dianosaur = new Tyrannosaur();
		dianosaur.kill();

	}

}
