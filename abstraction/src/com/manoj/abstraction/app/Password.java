package com.manoj.abstraction.app;

public class Password implements PassportVerification {

	@Override
	public void verifyCitizen() {
		System.out.println("invoking verifyCitizen() in Password");

	}

}
