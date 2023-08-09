package com.manoj.java_09_08.boot;

import com.manoj.java_09_08.app.PoliceStation;
import com.manoj.java_09_08.app.TraficPoliceStation;

public class PoliceStationRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in PoliceStationRunner");

		PoliceStation policeStation = new TraficPoliceStation();
		policeStation.arrest();
		System.out.println("*********Child ref**********");

		TraficPoliceStation traficPoliceStation = new TraficPoliceStation();
		traficPoliceStation.arrest();

	}

}
