package com.manoj.Abstract.app;

public abstract class Vehicle {

	public abstract void start();

	public abstract void stop();

	public abstract void accelerate();

	public abstract void brake();

	public abstract String getType();

	public void displayInfo() {
		System.out.println("invoking displayInfo() in Vehicle");

	}

	public void honk() {
		System.out.println("invoking honk() in Vehicle");
	}

	public void printType() {
		System.out.println("invoking printType() in Vehicle");
	}

	public boolean needsFuel() {
		System.out.println("invoking needsFuel() in Vehicle");
		return true;
	}

	public void printFuelStatus() {
		System.out.println("invoking printFuelStatus() in Vehicle");
	}
}
