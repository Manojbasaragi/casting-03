package com.manoj.abstraction.app;

public class UserName implements PassportVerification {

	@Override
	public void verifyCitizen() {
		System.out.println("invoking verifyCitizen() in UserName");

	}

}
