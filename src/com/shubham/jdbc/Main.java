package com.shubham.jdbc;

import java.sql.SQLException;

public class Main {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		JdbcInit jdbc = new JdbcInit();
		
		Employee e = jdbc.getEmployee(1);
		System.out.println("Ola: " + e.getEmpName());
		
	}
}
