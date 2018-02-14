package com.shubham.inheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Inheritance.xml");
		Employee emp = (Employee) ctx.getBean("employee");
		emp.fullName();
		EmployeeProject empPro = (EmployeeProject) ctx.getBean("empproject");
		empPro.printDetails();
	}
}
