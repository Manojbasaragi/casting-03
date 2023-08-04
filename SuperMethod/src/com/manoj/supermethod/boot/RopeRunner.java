package com.manoj.supermethod.boot;

import com.manoj.supermethod.app.ClimbingRope;

public class RopeRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in RopeRunner");
		
		ClimbingRope climbingRope = new ClimbingRope();
		System.out.println(climbingRope.isDynamic);
		System.out.println(climbingRope.length);
		System.out.println(climbingRope.material);
		System.out.println(climbingRope.weightCapacity);
		
		System.out.println("************************");
		
		ClimbingRope climbingRope2 = new ClimbingRope(20,"Cotton",500,true);
		System.out.println(climbingRope2.isDynamic);
		System.out.println(climbingRope2.length);
		System.out.println(climbingRope2.material);
		System.out.println(climbingRope2.weightCapacity);
		
	}

}
