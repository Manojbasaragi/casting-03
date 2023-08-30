package com.manoj.abstraction.app;

public class Router implements Internet {
	@Override
	public void connect() {
		System.out.println("invoking connect() in Router");

	}

}
