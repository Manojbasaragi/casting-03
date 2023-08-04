package com.manoj.supermethod.app;

public class ClimbingRope extends Rope {

	public ClimbingRope() {
		super(30, "Nylon", 1000, false);
		System.out.println("invoking no-arg Const. of ClimbingRope");
	}

	public ClimbingRope(double length, String material, int weightCapacity, boolean isDynamic) {
		super(length, material, weightCapacity, isDynamic);
		System.out.println("invoking double,String,int,boolean Const. of ClimbingRope");
	}
}
