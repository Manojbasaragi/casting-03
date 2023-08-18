package com.manoj.Object.boot;

import com.manoj.Object.app.Minister;

public class MinisterRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in MinisterRunneer");

		Minister minister = new Minister("Manoj", 23, "BJP", false, 2, "BE");
		System.out.println(minister);

		Minister minister2 = new Minister("Prabhu", 24, "JDS", false, 3, "BA");
		System.out.println(minister2);
		System.out.println("****************************");

		boolean same = minister.equals(minister2);
		System.out.println("contents are same:" + same);

	}

}
