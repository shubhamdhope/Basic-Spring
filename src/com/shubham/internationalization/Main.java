package com.shubham.internationalization;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Internationalization.xml");
		Employee emp = (Employee) ctx.getBean("employee");
		emp.fullName();
		System.out.println(ctx.getMessage("firstMessage", null, "DefaultMessage", null));
	}
}
