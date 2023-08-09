package com.manoj.java_09_08.boot;

import com.manoj.java_09_08.app.ESIHospital;
import com.manoj.java_09_08.app.Hospital;

public class HospitalRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in HospitalRunner");

		Hospital hospital = new ESIHospital();
		hospital.admit();
		System.out.println("*********Child ref**********");
		ESIHospital esiHospital = new ESIHospital();
		esiHospital.admit();

	}

}
