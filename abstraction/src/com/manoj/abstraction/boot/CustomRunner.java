package com.manoj.abstraction.boot;

import com.manoj.abstraction.app.Custom;
import com.manoj.abstraction.app.PassportVerification;
import com.manoj.abstraction.app.UserName;

public class CustomRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in CustomRunner ");

		PassportVerification passportVerification = new UserName();

		Custom custom = new Custom();
		custom.verifyCitizen();
		custom.setPassportVerification(passportVerification);

	}

}
