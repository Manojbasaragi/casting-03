package com.manoj.Abstract.boot;

import com.manoj.Abstract.app.Animal;
import com.manoj.Abstract.app.Dog;

public class AnimalRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in AnimalRunner");

		Animal animal = new Dog();
		animal.displayInfo();
		animal.move();
		animal.printType();
		animal.needsGrooming();
		animal.printGroomingStatus();
		System.out.println("**********abstract methods");
		animal.makeSound();
		animal.eat();
		animal.sleep();
		animal.getType();
		animal.isPet();

	}

}
