package com.shubham.alias;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Alias.xml");
		Employee emp = (Employee) ctx.getBean("employee-alias");
		emp.fullName();
	}
}
