package com.manoj.supermethod.boot;

import com.manoj.supermethod.app.WirelessRouter;

public class RouterRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in RouterRunner");

		WirelessRouter wirelessRouter = new WirelessRouter();
		System.out.println(wirelessRouter.ipAddress);
		System.out.println(wirelessRouter.isWireless);
		System.out.println(wirelessRouter.manufacturer);
		System.out.println(wirelessRouter.numberOfPorts);

		System.out.println("*****************************");

		WirelessRouter wirelessRouter2 = new WirelessRouter("191.164.1.2","Wipro",3,true);
		System.out.println(wirelessRouter2.ipAddress);
		System.out.println(wirelessRouter2.isWireless);
		System.out.println(wirelessRouter2.manufacturer);
		System.out.println(wirelessRouter2.numberOfPorts);

	}

}
