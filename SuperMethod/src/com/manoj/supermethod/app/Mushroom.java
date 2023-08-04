package com.manoj.supermethod.app;

public class Mushroom {
	public String name;
	public boolean edible;
	public double weightInGrams;
	public String habitat;

	public Mushroom(String name, boolean edible, double weightInGrams, String habitat) {
		System.out.println("invoking String,boolean,double,String Const. of Mushroom");
		this.name = name;
		this.edible = edible;
		this.weightInGrams = weightInGrams;
		this.habitat = habitat;
	}

}
