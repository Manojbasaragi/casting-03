package com.manoj.Object.app;

public class CEO {
	private String name;
	private int age;
	private String company;
	private int yearsInPosition;
	private double salary;
	private String educationalBackground;

	public CEO() {

	}

	public CEO(String name, int age, String company, int yearsInPosition, double salary, String educationalBackground) {
		super();
		this.name = name;
		this.age = age;
		this.company = company;
		this.yearsInPosition = yearsInPosition;
		this.salary = salary;
		this.educationalBackground = educationalBackground;
	}

	@Override
	public String toString() {
		System.out.println("invoking toString() in CEO");
		return "Name:" + name + " Age:" + age + " Company:" + company + " Experience:" + yearsInPosition + " Salary:"
				+ salary + " Education:" + educationalBackground;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("invoking equals() in CEO");
		if (obj != null) {
			System.out.println("obj is not null");
			if (obj instanceof CEO) {
				System.out.println("object is of CEO");
				CEO c = (CEO) obj;
				if (c.name.equals(this.name) && c.age == this.age) {
					System.out.println("object and properties are same");
					return true;
				} else {
					System.err.println("object and properties are not same");
				}
			} else {
				System.err.println("object is not of CEO");
			}
		} else {
			System.err.println("obj is null");
		}
		return false;
	}

}
