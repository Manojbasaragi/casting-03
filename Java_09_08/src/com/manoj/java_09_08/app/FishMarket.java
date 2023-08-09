package com.manoj.java_09_08.app;

public class FishMarket extends Market {
	@Override
	public void sell() {
		System.out.println("invoking sell method in FishMarket");
		sell(name);
	}

	@Override
	public void sell(String name) {
		System.out.println("invoking sell method of String in FishMarket");
		sell(name, location);
	}

	@Override
	public void sell(String name, String location) {
		System.out.println("invoking sell method of String,String in FishMarket");
		sell(name, location, type);
	}

	@Override
	public void sell(String name, String location, String type) {
		System.out.println("invoking sell method of String,String,String in FishMarket");
		sell(name, location, type, capacity);
	}

	@Override
	public void sell(String name, String location, String type, int capacity) {
		System.out.println("invoking sell method of String,String,String,int in FishMarket");
		sell(name, location, type, capacity, totalRevenu);
	}

	@Override
	public void sell(String name, String location, String type, int capacity, double totalRevenu) {
		System.out.println("invoking sell method of String,String,String,int,double in FishMarket");
	}

}
