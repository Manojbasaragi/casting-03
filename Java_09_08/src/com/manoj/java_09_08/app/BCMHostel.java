package com.manoj.java_09_08.app;

public class BCMHostel extends Hostel {
	@Override
	public void addStudent() {
		System.out.println("invoking addStudent method in BCMHostel");
		addStudent(warden);
	}

	@Override
	public void addStudent(String warden) {
		System.out.println("invoking addStudent method of String in BCMHostel");
		addStudent(warden, noOfStudents);
	}

	@Override
	public void addStudent(String warden, int noOfStudents) {
		System.out.println("invoking addStudent method of String,int in BCMHostel");
		addStudent(warden, noOfStudents, location);
	}

	@Override
	public void addStudent(String warden, int noOfStudents, String location) {
		System.out.println("invoking addStudent method of String,int,String in BCMHostel");
		addStudent(warden, noOfStudents, location, isItGovt);
	}

	@Override
	public void addStudent(String warden, int noOfStudents, String location, boolean isItGovt) {
		System.out.println("invoking addStudent method of String,int,String,boolean in BCMHostel");
		addStudent(warden, noOfStudents, location, isItGovt, noOfWorkers);
	}

	@Override
	public void addStudent(String warden, int noOfStudents, String location, boolean isItGovt, int noOfWorkers) {
		System.out.println("invoking addStudent method of String,int,String,boolean,int in BCMHostel");
	}

}
