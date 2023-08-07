package com.manoj.overload.boot;

import com.manoj.overload.app.Hotel;

public class HotelRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in HotelRunner");

		Hotel hotel = new Hotel();
		hotel.invite();

	}

}
