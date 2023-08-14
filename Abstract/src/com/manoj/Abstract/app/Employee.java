package com.manoj.Abstract.app;

public abstract class Employee {

	public abstract void calculateSalary();

	public abstract void performWork();

	public abstract void submitTimesheet();

	public abstract String getRole();

	public abstract boolean isFullTime();

	public void displayInfo() {
		System.out.println("invoking displayInfo() in Employee");

	}

	public void attendMeeting() {
		System.out.println("invoking attendMeeting() in Employee");
	}

	public void printRole() {
		System.out.println("invoking printRole() in Employee");
	}

	public boolean needsVacation() {
		System.out.println("invoking needsVacation() in Employee");
		return false;
	}

	public void printVacationStatus() {
		System.out.println("invoking printVacationStatus() in Employee");
	}
}
