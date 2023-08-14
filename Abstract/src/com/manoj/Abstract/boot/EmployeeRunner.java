package com.manoj.Abstract.boot;

import java.net.CookieManager;

import com.manoj.Abstract.app.Employee;
import com.manoj.Abstract.app.Manager;

public class EmployeeRunner {

	public static void main(String[] args) {
		System.out.println("invoking  main in EmployeeRunner");

		Employee employee = new Manager();
		employee.displayInfo();
		employee.attendMeeting();
		employee.printRole();
		employee.needsVacation();
		employee.printVacationStatus();
		System.out.println("*******abstract method********");
		employee.calculateSalary();
		employee.performWork();
		employee.submitTimesheet();
		employee.getRole();
		employee.isFullTime();

	}

}
