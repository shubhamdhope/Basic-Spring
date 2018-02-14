package com.shubham.jdbcDAOSupport;

import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class JdbcInitDAOSupport extends JdbcDaoSupport{

	public Employee getEmployee(int id){
		
		String sql = "select * from emp where id = ?";
		return getJdbcTemplate().queryForObject(sql, new ParameterizedRowMapper<Employee>() {

			public Employee mapRow(ResultSet rs, int cnt)
					throws SQLException {
				// TODO Auto-generated method stub
				Employee e = new Employee();
				e.setEmpName(rs.getString("name"));
				
				return e;
			}
		}, id);
		
	}
}
