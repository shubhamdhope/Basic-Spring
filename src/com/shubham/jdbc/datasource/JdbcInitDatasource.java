package com.shubham.jdbc.datasource;

import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

public class JdbcInitDatasource {

	private DataSource dataSource;
	public Employee getEmployee(int id) throws ClassNotFoundException, SQLException{
		Connection conn = null;
		conn = dataSource.getConnection();
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
	public DataSource getDataSource() {
		return dataSource;
	}
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
}
