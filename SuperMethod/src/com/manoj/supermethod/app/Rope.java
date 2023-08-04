package com.manoj.supermethod.app;

public class Rope {
	public double length;
	public String material;
	public int weightCapacity;
	public boolean isDynamic;

	public Rope(double length, String material, int weightCapacity, boolean isDynamic) {
		System.out.println("invoking double,String,int,boolean Const. of Rope");
		this.length = length;
		this.material = material;
		this.weightCapacity = weightCapacity;
		this.isDynamic = isDynamic;
	}

}
