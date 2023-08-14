package com.manoj.Abstract.boot;

import com.manoj.Abstract.app.Rectangle;
import com.manoj.Abstract.app.Shape;

public class ShapeRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in ShapeRunner");

		Shape shape = new Rectangle();
		shape.calculateArea();
		shape.calculatePerimeter();
		shape.draw();
		shape.getName();
		shape.isRegular();
		System.out.println("********abstract methods***********");
		shape.displayInfo();
		shape.printDescription();
		shape.hasEqualSides();
		shape.printIsRegular();
		shape.printArea();
	}

}
