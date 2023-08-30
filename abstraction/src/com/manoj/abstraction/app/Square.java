package com.manoj.abstraction.app;

public class Square implements Shape {

	@Override
	public double area() {
		System.out.println("invoking area() in Square");
		return 0;
	}

}
