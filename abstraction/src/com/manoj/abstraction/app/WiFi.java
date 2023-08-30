package com.manoj.abstraction.app;

public class WiFi implements Internet {
	@Override
	public void connect() {
		System.out.println("invoking connect() in WiFi");
	}

}
