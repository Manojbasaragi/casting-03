package com.manoj.Abstract.app;

public class Rectangle extends Shape {
	@Override
	public double calculateArea() {
		System.out.println("invoking calculateArea() in Rectangle ");
		return 2.2;
	}

	@Override
	public double calculatePerimeter() {
		System.out.println("invoking calculatePerimeter() in Rectangle ");
		return 3.8;
	}

	@Override
	public void draw() {
		System.out.println("invoking draw() in Rectangle ");
	}

	@Override
	public String getName() {
		System.out.println("invoking getName() in Rectangle ");
		return "rectangle";
	}

	@Override
	public boolean isRegular() {
		System.out.println("invoking isRegular() in Rectangle ");
		return false;
	}
}
