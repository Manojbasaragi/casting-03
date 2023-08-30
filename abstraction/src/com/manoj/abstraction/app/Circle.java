package com.manoj.abstraction.app;

public class Circle implements Shape {

	@Override
	public double area() {
		System.out.println("invoking area() in Circle");
		return 0;
	}

}
