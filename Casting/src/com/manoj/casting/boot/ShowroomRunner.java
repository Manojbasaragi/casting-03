package com.manoj.casting.boot;

import com.manoj.casting.app.MobilShowroom;
import com.manoj.casting.app.Showroom;
import com.manoj.casting.app.ShowroomUtil;
import com.manoj.casting.app.WatchShowroom;

public class ShowroomRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in ShowrromRunner");

		Showroom showroom = new WatchShowroom();
		//Showroom showroom = new MobilShowroom();
		WatchShowroom watchShowroom = (WatchShowroom) showroom;
		//MobileShowroom mobilShowroom = (MobilShowroom)showroom;
		ShowroomUtil.run();

	}

}
