package com.manoj.abstraction.app;

public class Shopping {
	Payment payment = new CreditCardPayment();

	public void proecessPayment() {
		System.out.println("invoking processPayment in Shopping");
		this.payment.processPayment();
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

}
