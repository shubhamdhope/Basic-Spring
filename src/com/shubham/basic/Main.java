package com.shubham.basic;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Basic.xml");
		A a = (A) ctx.getBean("A");
		System.out.println(a.getMessage());
	}
}
