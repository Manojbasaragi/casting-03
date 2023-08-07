package com.manoj.overload.boot;

import com.manoj.overload.app.Umbrella;

public class UmbrellaRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in UmbrellaRunner");

		Umbrella umbrella = new Umbrella();
		umbrella.open();

	}

}
