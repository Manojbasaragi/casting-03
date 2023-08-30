package com.manoj.abstraction.app;

public class CreditCardPayment implements Payment {

	@Override
	public void processPayment() {
		System.out.println("invoking processPayment() in CreditCardPayment");
	}

}
