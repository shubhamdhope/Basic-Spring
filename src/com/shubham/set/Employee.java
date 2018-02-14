package com.shubham.set;

import java.util.Set;

public class Employee {
	private int empId;
	private String empName;
	private Set<Address> address;
	
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
	public Set<Address> getAddress() {
		return address;
	}
	public void setAddress(Set<Address> address) {
		this.address = address;
	}
	
	
	
}
