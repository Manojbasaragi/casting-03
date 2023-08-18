package com.manoj.Object.app;

public class Minister {
	private String name;
	private int age;
	private String party;
	private boolean isFemale;
	private int yearsOfService;
	private String educationBackground;

	public Minister() {

	}

	public Minister(String name, int age, String party, boolean isFemale, int yearsOfService,
			String educationBackground) {
		super();
		this.name = name;
		this.age = age;
		this.party = party;
		this.isFemale = isFemale;
		this.yearsOfService = yearsOfService;
		this.educationBackground = educationBackground;
	}

	@Override
	public String toString() {
		System.out.println("invoking toString() in Minister");
		return "Name:" + name + " Age:" + age + " Party:" + party + " Male:" + isFemale + " Experience:"
				+ yearsOfService + " Education:" + educationBackground;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("invoking equals() in Minister");
		if (obj != null) {
			System.out.println("obj is not null");
			if (obj instanceof Minister) {
				System.out.println("object is instance of minister");
				Minister min = (Minister) obj;
				if (min.name.equals(this.name)) {
					System.out.println("object and properties are same");
					return true;
				} else {
					System.err.println("object and properties are not same");
				}
			} else {
				System.err.println("object is not of Minister");
			}
		} else {
			System.err.println("obj is null");
		}
		return false;
	}

}
