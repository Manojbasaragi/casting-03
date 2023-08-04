package com.manoj.supermethod.app;

public class FancyDaimond extends Diamond {

	public FancyDaimond() {
		super("Round", 1.5, "White", "IF");
		System.out.println("invoking no-arg Const. of FancyDiamond");
	}

	public FancyDaimond(String shape, double carat, String color, String clarity) {
		super(shape, carat, color, clarity);
		System.out.println("invoking String,double,String,String Const. of FancyDiamond");
	}

}
