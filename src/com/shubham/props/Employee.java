package com.shubham.props;

import java.util.Map;
import java.util.Map.Entry;

public class Employee {
	private int empId;
	private String empName;
	private Map<String,String> address;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public void fullName(){
		System.out.println(empId + "  " + empName);
		for (Entry<String, String> ele : address.entrySet()) {
			System.out.println(ele.getKey() + " " + ele.getValue());
		}
		
	}
	public Map<String,String> getAddress() {
		return address;
	}
	public void setAddress(Map<String,String> address) {
		this.address = address;
	}
	
	
	
}
