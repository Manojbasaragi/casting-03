package com.manoj.override.app;

public class VIPTicket extends Ticket {
	@Override
	public void showPrice() {
		System.out.println("invoking shoePrice method in Ticket");
	}

}
