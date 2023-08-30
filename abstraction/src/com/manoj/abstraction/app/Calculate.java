package com.manoj.abstraction.app;

public class Calculate {
	private Shape shape = new Circle();

	public void area() {
		System.out.println("invoking area() in Calculate");
		this.shape.area();
	}

	public void setShape(Shape shape) {
		this.shape = shape;
	}

}
