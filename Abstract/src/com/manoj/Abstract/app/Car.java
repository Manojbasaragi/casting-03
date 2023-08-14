package com.manoj.Abstract.app;

public class Car extends Vehicle {
	@Override
	public void start() {
		System.out.println("invoking start() in Car");
	}

	@Override
	public void stop() {
		System.out.println("invoking stop() in Car");
	}

	@Override
	public void accelerate() {
		System.out.println("invoking accelerate() in Car");
	}

	@Override
	public void brake() {
		System.out.println("invoking brake() in Car");
	}

	@Override
	public String getType() {
		System.out.println("invoking getType() in Car");
		return "Car";
	}

	@Override
	public boolean needsFuel() {
		System.out.println("invoking needsFuel() in Car");
		return true;
	}
}
