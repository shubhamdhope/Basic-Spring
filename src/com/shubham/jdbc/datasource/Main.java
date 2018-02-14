package com.shubham.jdbc.datasource;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("DataSource.xml");
		JdbcInitDatasource bean = ctx.getBean("JdbcInitDatasource", JdbcInitDatasource.class);
		Employee e = bean.getEmployee(1);
		System.out.println("Ola: " + e.getEmpName());
		
	}
}
