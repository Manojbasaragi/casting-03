package com.manoj.supermethod.boot;

import com.manoj.supermethod.app.FancyDaimond;

public class DiamondRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in DaimonRunner");

		FancyDaimond fancyDaimond = new FancyDaimond();
		System.out.println(fancyDaimond.carat);
		System.out.println(fancyDaimond.clarity);
		System.out.println(fancyDaimond.color);
		System.out.println(fancyDaimond.shape);

		System.out.println("*******************");

		FancyDaimond fancyDaimond1 = new FancyDaimond("Princess",0.75,"Red","VS2");
		System.out.println(fancyDaimond1.carat);
		System.out.println(fancyDaimond1.clarity);
		System.out.println(fancyDaimond1.color);
		System.out.println(fancyDaimond1.shape);

	}

}
