package com.manoj.java_09_08.app;

public class BelagaviCity extends City {
	@Override
	public void welcome() {
		System.out.println("invoking welcome method in BelagaviCity");
		welcome(name);
	}

	@Override
	public void welcome(String name) {
		System.out.println("invoking welcome method of String in BelagaviCity");
		welcome(name, country);
	}

	@Override
	public void welcome(String name, String country) {
		System.out.println("invoking welcome method of String,String in BelagaviCity");
		welcome(name, country, population);
	}

	@Override
	public void welcome(String name, String country, int population) {
		System.out.println("invoking welcome method of String,String,int in BelagaviCity");
		welcome(name, country, population, area);
	}

	@Override
	public void welcome(String name, String country, int population, double area) {
		System.out.println("invoking welcome method of String,String,int,double in BelagaviCity");
		welcome(name, country, population, area, mayor);
	}

	@Override
	public void welcome(String name, String country, int population, double area, String mayor) {
		System.out.println("invoking welcome method of String,String,int,double,String in BelagaviCity");
	}

}
