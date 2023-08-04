package com.manoj.supermethod.app;

public class CricketGround extends Ground {

	public CricketGround() {
		super("Grass", 500, false, "Forest");
		System.out.println("invoking no-arg Const. 0f CrickeGround");
	}

	public CricketGround(String surfaceType, double elevation, boolean isWet, String vegetationType) {
		super(surfaceType, elevation, isWet, vegetationType);
		System.out.println("invoking String,double,boolean,String Const. of CrickeGroung");
	}

}
