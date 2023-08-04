package com.manoj.supermethod.app;

public class PoisonMushroom extends Mushroom {

	public PoisonMushroom() {
		super("Amanita muscaria", true, 20, "deciduous forests");
		System.out.println("invoking no-arg Const. of PoisonMushroom");
	}

	public PoisonMushroom(String name, boolean edible, double weightInGrams, String habitat) {
		super(name, edible, weightInGrams, habitat);
		System.out.println("invoking String,boolean,double,String Const. of PoisonMushroom");
	}

}
