package com.manoj.Object.boot;

import com.manoj.Object.app.CEO;

public class CEORunner {

	public static void main(String[] args) {
		System.out.println("invoking main in CEORunner ");

		CEO ceo = new CEO("Bharat", 30, "Infosys", 3, 10000, "BE");
		System.out.println(ceo);

		CEO ceo1 = new CEO("Bharat", 30, "ISRO", 5, 30000, "MSc");
		System.out.println(ceo1);
		System.out.println("****************************");

		boolean same = ceo.equals(ceo1);
		System.out.println("Properties are same:" + same);

	}

}
