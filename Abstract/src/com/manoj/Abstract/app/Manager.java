package com.manoj.Abstract.app;

public class Manager extends Employee {
	@Override
	public void calculateSalary() {
		System.out.println("invoking calculateSalary() in Manager");
	}

	@Override
	public void performWork() {
		System.out.println("invoking performWork() in Manager");
	}

	@Override
	public void submitTimesheet() {
		System.out.println("invoking submitTimesheet() in Manager");
	}

	@Override
	public String getRole() {
		System.out.println("invoking getRole() in Manager");
		return "Manager";
	}

	@Override
	public boolean isFullTime() {
		System.out.println("invoking isFullTime() in Manager");
		return true;
	}

}