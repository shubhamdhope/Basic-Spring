package com.shubham.beanpostprocessor;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("BeanPostProcessor.xml");
		ctx.registerShutdownHook();
		Employee emp = (Employee) ctx.getBean("employee");
		emp.fullName();
	}
}
