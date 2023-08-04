package com.manoj.supermethod.app;

public class Ground {
	public String surfaceType;
	public double elevation;
	public boolean isWet;
	public String vegetationType;

	public Ground(String surfaceType, double elevation, boolean isWet, String vegetationType) {
		System.out.println("invoking String,double,boolean,String Const. of Ground");
		this.elevation = elevation;
		this.surfaceType = surfaceType;
		this.isWet = isWet;
		this.vegetationType = vegetationType;
	}

}
