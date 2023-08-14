package com.manoj.Abstract.boot;

import com.manoj.Abstract.app.Car;
import com.manoj.Abstract.app.Vehicle;

public class VehicleRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in VehicleRunner");

		Vehicle vehicle = new Car();
		vehicle.displayInfo();
		vehicle.honk();
		vehicle.printFuelStatus();
		vehicle.printType();
		vehicle.needsFuel();
		System.out.println("**********abstract methods**********");
		vehicle.start();
		vehicle.stop();
		vehicle.accelerate();
		vehicle.brake();
		vehicle.getType();

	}

}
