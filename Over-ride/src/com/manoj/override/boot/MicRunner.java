package com.manoj.override.boot;

import com.manoj.override.app.Mic;
import com.manoj.override.app.WirelessMic;

public class MicRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in MicRunner");

		Mic mic = new WirelessMic();
		mic.record();

	}

}
