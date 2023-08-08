package com.manoj.override.app;

public class SteelDrum extends Drum {
	@Override
	public void sound() {
		System.out.println("invoking sound method in SteelDrum");
	}

}
