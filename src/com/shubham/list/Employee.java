package com.shubham.list;

import java.util.List;

public class Employee {
	private int empId;
	private String empName;
	private List<Address> address;
	
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
		for (Address add : address) {
			System.out.println(add.getCity() + " " + add.getState());
		}
	}
	public List<Address> getAddress() {
		return address;
	}
	public void setAddress(List<Address> address) {
		this.address = address;
	}
	
	
	
}
