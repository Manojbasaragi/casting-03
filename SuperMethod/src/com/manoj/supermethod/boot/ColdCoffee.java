package com.manoj.supermethod.boot;

import com.manoj.supermethod.app.Coffee;

public class ColdCoffee extends Coffee {

	public ColdCoffee() {
		super("Bru", 60, "Colombia", false);
		System.out.println("invoking no-arg Const. of ColdCoffe");
	}

	public ColdCoffee(String type, int caffeineLevel, String origin, boolean isDecaf) {
		super(type, caffeineLevel, origin, isDecaf);
		System.out.println("invoking String,int,String,boolean Const. of Coffee");

	}

}
