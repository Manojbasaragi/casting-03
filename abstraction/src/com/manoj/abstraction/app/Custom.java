package com.manoj.abstraction.app;

public class Custom {
	PassportVerification passportVerification = new UserName();

	public void verifyCitizen() {
		System.out.println("invoking verifyCitizen() in Custom ");
		this.passportVerification.verifyCitizen();
	}

	public void setPassportVerification(PassportVerification passportVerification) {
		this.passportVerification = passportVerification;
	}

}
