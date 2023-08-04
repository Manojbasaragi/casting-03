package com.manoj.supermethod.app;

public class Router {
	public String ipAddress;
	public String manufacturer;
	public int numberOfPorts;
	public boolean isWireless;

	public Router(String ipAddress, String manufacturer, int numberOfPorts, boolean isWireless) {
		System.out.println("invoking String,String,int,boolean Const. of Router");
		this.ipAddress = ipAddress;
		this.manufacturer = manufacturer;
		this.numberOfPorts = numberOfPorts;
		this.isWireless = isWireless;
	}

}
