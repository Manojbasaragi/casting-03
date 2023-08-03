package com.manoj.casting.boot;

import com.manoj.casting.app.chocolate.CaramelChocolate;
import com.manoj.casting.app.chocolate.Chocolate;
import com.manoj.casting.app.chocolate.ChocolateUtil;
import com.manoj.casting.app.chocolate.DarkChocolate;

public class ChocolateRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in ChocolateRunner");

		Chocolate chocolate = new DarkChocolate();
		// or Chocolate chocolate = new CaramelChocolate();
		System.out.println(chocolate.name);
		chocolate.enjoy();

		DarkChocolate darkChocolate = (DarkChocolate) chocolate;
		// or CaramelChocolate caramelChocolate = (CaramelChocolate)chocolate;
		ChocolateUtil.run();

	}

}
