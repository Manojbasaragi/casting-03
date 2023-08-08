package com.manoj.override.app;

public class Tyrannosaur extends Dianosaur {
	@Override
	public void kill() {
		System.out.println("invoking kill method in Tyrannosaur");
	}

}
