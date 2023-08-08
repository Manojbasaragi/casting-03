package com.manoj.override.app;

public class FancyBangle extends Bangle {
	@Override
	public void wear() {
		System.out.println("invoking wear method in FancyBangle");
	}

}
