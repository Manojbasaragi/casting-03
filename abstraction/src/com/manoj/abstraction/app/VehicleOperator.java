package com.manoj.abstraction.app;

public class VehicleOperator {

	private Vehicle vehicle = new Car();

	public void start() {
		System.out.println("invoking start() in VehicleOperator");
		this.vehicle.start();
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
}
