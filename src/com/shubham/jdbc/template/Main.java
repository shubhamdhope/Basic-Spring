package com.shubham.jdbc.template;

import java.sql.SQLException;
import java.util.Iterator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Template.xml");
		JdbcInitTemplate bean = ctx.getBean("JdbcInitTemplate", JdbcInitTemplate.class);
		Employee e = bean.getEmployee(1);
		System.out.println("Ola: " + e.getEmpName());
		System.out.println("List: ");
		for (int i = 0; i < bean.displayAllEmployees().size(); i++) {
			System.out.println(bean.displayAllEmployees().get(i).getId() + " " + bean.displayAllEmployees().get(i).getEmpName());
		}
		
	}
}
