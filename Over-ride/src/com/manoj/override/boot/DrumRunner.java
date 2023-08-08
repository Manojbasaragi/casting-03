package com.manoj.override.boot;

import com.manoj.override.app.Drum;
import com.manoj.override.app.SteelDrum;

public class DrumRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in DrumRunner");

		Drum drum = new SteelDrum();
		drum.sound();

	}

}
