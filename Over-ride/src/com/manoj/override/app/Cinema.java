package com.manoj.override.app;

public class Cinema extends Theater {
	@Override
	public void play() {
		System.out.println("invoking play method in Theater");
	}

}
