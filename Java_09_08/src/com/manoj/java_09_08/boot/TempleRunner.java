package com.manoj.java_09_08.boot;

import com.manoj.java_09_08.app.ShivaTemple;
import com.manoj.java_09_08.app.Temple;

public class TempleRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in TempleRunner");

		Temple temple = new ShivaTemple();
		temple.hope();
		System.out.println("************Child ref*************");
		ShivaTemple shivaTemple = new ShivaTemple();
		shivaTemple.hope();

	}

}
