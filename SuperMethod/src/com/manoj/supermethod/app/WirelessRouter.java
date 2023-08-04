package com.manoj.supermethod.app;

public class WirelessRouter extends Router {

	public WirelessRouter() {
		super("192.168.1.1", "Cisco", 4, false);
		System.out.println("invoking no-arg Cons. of WirelessRouter");
	}

	public WirelessRouter(String ipAddress, String manufacturer, int numberOfPorts, boolean isWireless) {
		super(ipAddress, manufacturer, numberOfPorts, isWireless);
		System.out.println("invoking String,String,int,boolean Const. of WirelessRouter");
	}

}
