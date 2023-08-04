package com.manoj.supermethod.boot;

public class CoffeeRunner {

	public static void main(String[] args) {
		System.out.println("invokinf main in CoffeeRunner ");

		ColdCoffee coldCoffee = new ColdCoffee();
		System.out.println(coldCoffee.caffeineLevel);
		System.out.println(coldCoffee.isDecaf);
		System.out.println(coldCoffee.origin);
		System.out.println(coldCoffee.type);

		System.out.println("*********************");

		ColdCoffee coldCoffee1 = new ColdCoffee("NesCasfe",120,"Ethiopia",true);
		System.out.println(coldCoffee1.caffeineLevel);
		System.out.println(coldCoffee1.isDecaf);
		System.out.println(coldCoffee1.origin);
		System.out.println(coldCoffee1.type);
	}

}
