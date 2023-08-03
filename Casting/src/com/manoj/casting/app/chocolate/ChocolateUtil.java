package com.manoj.casting.app.chocolate;

public class ChocolateUtil {

	public static void run() {
		System.out.println("invoking run() in ChocolateUtil");

		Chocolate chocolate = new DarkChocolate();
		//or Chocolate chocolate = new CaramelChocolate();
		System.out.println(chocolate.name);
		chocolate.enjoy();

		if (chocolate instanceof DarkChocolate) {
			DarkChocolate darkChocolate = (DarkChocolate) chocolate;
			System.out.println(darkChocolate.price);
			darkChocolate.eat();
		}

		if (chocolate instanceof CaramelChocolate) {
			CaramelChocolate caramelChocolate = (CaramelChocolate) chocolate;
			System.out.println(caramelChocolate.isItTasty);
			caramelChocolate.openWrapper();
		}

	}

}
