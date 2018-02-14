package com.shubham.jdbcDAOSupport;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("DAOSupport.xml");
		JdbcInitDAOSupport bean = ctx.getBean("JdbcInitDAOSupport", JdbcInitDAOSupport.class);
		Employee e = bean.getEmployee(1);
		System.out.println("Ola: " + e.getEmpName());
		
	}
}
