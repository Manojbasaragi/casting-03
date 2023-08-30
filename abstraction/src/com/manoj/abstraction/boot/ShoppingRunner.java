package com.manoj.abstraction.boot;

import com.manoj.abstraction.app.CreditCardPayment;
import com.manoj.abstraction.app.Payment;
import com.manoj.abstraction.app.Shopping;

public class ShoppingRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in ShoppingRunner");

		Payment payment = new CreditCardPayment();

		Shopping shopping = new Shopping();
		shopping.proecessPayment();
		shopping.setPayment(payment);
	}

}
