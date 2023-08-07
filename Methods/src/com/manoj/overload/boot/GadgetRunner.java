package com.manoj.overload.boot;

import com.manoj.overload.app.Gadget;

public class GadgetRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in GadgetRunner");

		Gadget gadget = new Gadget();
		gadget.displayInfo();

	}

}
