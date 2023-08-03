package com.manoj.casting.app;

public class ShowroomUtil {

	public static void run() {
		Showroom showroom = new MobilShowroom();
		//showroom showroom = new WatchShowroom()
		System.out.println(showroom.location);
		showroom.closed();

		if (showroom instanceof WatchShowroom) {
			WatchShowroom watchShowroom = (WatchShowroom) showroom;
			System.out.println(watchShowroom.typesOfWatch);
			watchShowroom.discount();
		}
		if (showroom instanceof MobilShowroom) {
			MobilShowroom mobilShowroom = (MobilShowroom) showroom;
			System.out.println(mobilShowroom.since);
			mobilShowroom.giftOffer();
		}
	}

}
