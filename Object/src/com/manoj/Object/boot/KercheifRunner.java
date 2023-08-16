package com.manoj.Object.boot;

import com.manoj.Object.app.Kercheif;

public class KercheifRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in KercheifRunner");

		Kercheif kercheif = new Kercheif("Spin Cart", "Hand Kercheif", 100, "White", false, 20, false);
		System.out.println(kercheif);

		Kercheif kercheif1 = new Kercheif("Jockey", "Hand Kercheif", 200, "Blue", true, 10, true);
		System.out.println(kercheif1);

		Kercheif kercheif2 = new Kercheif("Allen Solley", "Face Kercheif", 50, "Chocolate", true, 30, true);
		System.out.println(kercheif2);

	}

}
