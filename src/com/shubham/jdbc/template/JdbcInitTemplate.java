package com.shubham.jdbc.template;

import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;

public class JdbcInitTemplate {

	private JdbcTemplate jdbcTemplate;
	public Employee getEmployee(int id){
		
		String sql = "select * from emp where id = ?";
		return jdbcTemplate.queryForObject(sql, new EmployeeMapper(), id);
		
	}
	
	private static final class EmployeeMapper implements ParameterizedRowMapper<Employee>{

		public Employee mapRow(ResultSet rs, int arg1) throws SQLException {
			// TODO Auto-generated method stub
			Employee e = new Employee();
			e.setId(rs.getInt("id"));
			e.setEmpName(rs.getString("name"));
			return e;
		}
		
	}
	
	public List<Employee> displayAllEmployees(){
		String sql = "select * from emp";
		return jdbcTemplate.query(sql, new EmployeeMapper());
	}
	
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
}
