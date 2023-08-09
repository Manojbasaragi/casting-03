package com.manoj.java_09_08.app;

public class TraficPoliceStation extends PoliceStation {
	@Override
	public void arrest() {
		System.out.println("invoking arrest method in TraficPoliceStation");
		arrest(name);
	}

	@Override
	public void arrest(String name) {
		System.out.println("invoking arrest method of String in TraficPoliceStation");
		arrest(name, location);
	}

	@Override
	public void arrest(String name, String location) {
		System.out.println("invoking arrest method of String,String in TraficPoliceStation");
		arrest(name, location, officersCount);
	}

	@Override
	public void arrest(String name, String location, int officersCount) {
		System.out.println("invoking arrest method of String,String,int in TraficPoliceStation");
		arrest(name, location, officersCount, hasJail);
	}

	@Override
	public void arrest(String name, String location, int officersCount, boolean hasJail) {
		System.out.println("invoking arrest method of String,String,int,boolean in TraficPoliceStation");
		arrest(name, location, officersCount, hasJail, emergencyNumber);
	}

	@Override
	public void arrest(String name, String location, int officersCount, boolean hasJail, String emergencyNumber) {
		System.out.println("invoking arrest method of String,String,int,boolean,String in TraficPoliceStation");
	}

}
