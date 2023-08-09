package com.manoj.java_09_08.boot;

import com.manoj.java_09_08.app.BCMHostel;
import com.manoj.java_09_08.app.Hostel;

public class HostelRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in HostelRunner");

		Hostel hostel = new BCMHostel();
		hostel.addStudent();
		System.out.println("*********Child ref***********");
		BCMHostel bcmHostel = new BCMHostel();
		bcmHostel.addStudent();

	}

}
