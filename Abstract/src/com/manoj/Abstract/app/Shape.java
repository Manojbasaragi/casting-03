package com.manoj.Abstract.app;

public abstract class Shape {

	public abstract double calculateArea();

	public abstract double calculatePerimeter();

	public abstract void draw();

	public abstract String getName();

	public abstract boolean isRegular();

	public void displayInfo() {
		System.out.println("invoking displayInfo() in Shape");
	}

	public void printDescription() {
		System.out.println("invoking printDescription() in Shape");
	}

	public boolean hasEqualSides() {
		System.out.println("invoking hasEqualSides() in Shape");
		return true;
	}

	public void printIsRegular() {
		System.out.println("invoking printIsRegular() in Shape");
	}

	public void printArea() {
		System.out.println("invoking printArea() in Shape");
	}

}
