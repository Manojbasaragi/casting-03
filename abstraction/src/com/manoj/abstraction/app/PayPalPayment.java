package com.manoj.abstraction.app;

public class PayPalPayment implements Payment {

	@Override
	public void processPayment() {
		System.out.println("invoking processPayment() in PayPalPayment");

	}

}
