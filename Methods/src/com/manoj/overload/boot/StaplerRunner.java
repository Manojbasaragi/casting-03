package com.manoj.overload.boot;

import com.manoj.overload.app.Stapler;

public class StaplerRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in StaplerRunner");

		Stapler stapler = new Stapler();
		stapler.staple();

	}

}
