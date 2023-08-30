package com.manoj.abstraction.app;

public class VehicleOperatorRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in vehicleOperatorRunner");

		Vehicle vehicle = new Car();

		VehicleOperator vehicleOperator = new VehicleOperator();
		vehicleOperator.start();
		vehicleOperator.setVehicle(vehicle);

	}

}
