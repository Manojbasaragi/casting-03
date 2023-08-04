package com.manoj.supermethod.app;

public class Coffee {

	public String type;
	public int caffeineLevel;
	public String origin;
	public boolean isDecaf;

	public Coffee(String type, int caffeineLevel, String origin, boolean isDecaf) {
		System.out.println("invoking String,int,String,boolean Const. of Coffee");
		this.type = type;
		this.caffeineLevel = caffeineLevel;
		this.isDecaf = isDecaf;
		this.origin = origin;

	}

}
