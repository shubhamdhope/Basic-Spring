package com.shubham.jdbc;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class JdbcInit {

	public Employee getEmployee(int id) throws ClassNotFoundException, SQLException{
		Connection conn = null;
		
		String driver = "com.mysql.jdbc.Driver";
		Class.forName(driver);
		
		conn = DriverManager.getConnection("jdbc:mysql://localhost/spring", "root", "root");
		PreparedStatement statement =  conn.prepareStatement("select * from emp where id = ?");
		statement.setInt(1, id);
		ResultSet rs = statement.executeQuery();
		
		Employee e = new Employee();
		while(rs.next()){
			e.setEmpName(rs.getString("name"));
		}
		
		statement.close();
		rs.close();
		
		return e;
	}
	
}
