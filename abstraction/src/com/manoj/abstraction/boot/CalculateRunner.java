package com.manoj.abstraction.boot;

import com.manoj.abstraction.app.Calculate;
import com.manoj.abstraction.app.Circle;
import com.manoj.abstraction.app.Shape;
import com.manoj.abstraction.app.Square;

public class CalculateRunner {

	public static void main(String[] args) {
		System.out.println("invoking  main in CalculateRunner");

		Shape shape = new Circle();

		Calculate calculate = new Calculate();
		calculate.area();
		calculate.setShape(shape);

	}

}
