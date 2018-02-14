package com.shubham.component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Component.xml");
		Employee emp = (Employee) ctx.getBean("employee");
		emp.fullName();
	}
}
