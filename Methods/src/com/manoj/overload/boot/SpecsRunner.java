package com.manoj.overload.boot;

import com.manoj.overload.app.Specs;

public class SpecsRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in SpecsRunner");

		Specs specs = new Specs();
		specs.makeVisible();

	}

}
