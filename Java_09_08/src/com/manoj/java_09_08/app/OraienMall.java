package com.manoj.java_09_08.app;

public class OraienMall extends Mall {
	@Override
	public void invite() {
		System.out.println("invoking invite method in OraienMall");
		invite(name);
	}

	@Override
	public void invite(String name) {
		System.out.println("invoking invite method of String in OraienMall");
		invite(name, location);
	}

	@Override
	public void invite(String name, String location) {
		System.out.println("invoking invite method of String,String in OraienMall");
		invite(name, location, dailyProfit);
	}

	@Override
	public void invite(String name, String location, double dailyProfit) {
		System.out.println("invoking invite method of String,String,double in OraienMall");
		invite(name, location, dailyProfit, peopleVisitPerDay);
	}

	@Override
	public void invite(String name, String location, double dailyProfit, int peopleVisitPerDay) {
		System.out.println("invoking invite method of String,String,double,int in OraienMall");
		invite(name, location, dailyProfit, peopleVisitPerDay, isThereGST);
	}

	@Override
	public void invite(String name, String location, double dailyProfit, int peopleVisitPerDay, boolean isThereGST) {
		System.out.println("invoking invite method of String,String,double,int,boolean in OraienMall");
	}

}
