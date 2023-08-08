package com.manoj.override.boot;

import com.manoj.override.app.Bangle;
import com.manoj.override.app.FancyBangle;

public class BangleRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in BangleRunner");

		Bangle bangle = new FancyBangle();
		bangle.wear();

	}

}
