package com.shubham.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Scope.xml");
		Employee emp = (Employee) ctx.getBean("employee");
		emp.fullName();
		
		Employee emp1 = (Employee) ctx.getBean("employee");
		emp1.fullName();
		
		Employee emp2 = (Employee) ctx.getBean("employee1");
		emp2.setEmpName("B");
		emp2.fullName();
		
		Employee emp3 = (Employee) ctx.getBean("employee1");
		emp3.fullName();
		
		/* 	101  A			same objects called for scope=singleton
			101  A
			102  B			different objects called for scope=prototype
			102  null
		 */
	}
}
