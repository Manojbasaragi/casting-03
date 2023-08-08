package com.manoj.override.boot;

import com.manoj.override.app.Cinema;
import com.manoj.override.app.Theater;

public class TheaterRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in TheaterRunner");

		Theater theater = new Cinema();
		theater.play();

	}

}
