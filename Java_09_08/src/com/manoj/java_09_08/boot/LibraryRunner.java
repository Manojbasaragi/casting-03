package com.manoj.java_09_08.boot;

import com.manoj.java_09_08.app.DigitalLibrary;
import com.manoj.java_09_08.app.Library;

public class LibraryRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in Libraryrunner");

		Library library = new DigitalLibrary();
		library.displyaInfo();
		System.out.println("*********Child ref**********");
		DigitalLibrary digitalLibrary = new DigitalLibrary();
		digitalLibrary.displyaInfo();

	}

}
