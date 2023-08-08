package com.manoj.override.app;

public class WirelessMic extends Mic {
	@Override
	public void record() {
		System.out.println("invooking record method in WirelessMic");
	}

}
