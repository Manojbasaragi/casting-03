package com.manoj.override.app;

public class Material extends Coal {
	@Override
	public void burn() {
		System.out.println("invoking burn method in Material");
	}

}
