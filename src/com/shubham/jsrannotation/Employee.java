package com.shubham.jsrannotation;

import javax.annotation.Resource;

public class Employee {
	private int empId;
	private String empName;
	
	@Resource(name="address1")
	private Address address;

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
		System.out.println(address.getCity() + " " + address.getState());
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
}
