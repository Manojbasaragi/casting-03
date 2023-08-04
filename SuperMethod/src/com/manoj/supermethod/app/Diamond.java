package com.manoj.supermethod.app;

public class Diamond {
	public String shape;
	public double carat;
	public String color;
	public String clarity;

	public Diamond(String shape, double carat, String color, String clarity) {
		System.out.println("invoking String,double,String,String Const. of Diamond");
		this.shape = shape;
		this.carat = carat;
		this.color = color;
		this.clarity = clarity;
	}

}
