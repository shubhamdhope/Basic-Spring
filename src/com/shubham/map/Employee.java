package com.shubham.map;


import java.util.Map;
import java.util.Map.Entry;

public class Employee {
	private int empId;
	private String empName;
	private Map<String, Address> address;
	
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
		for (Entry<String, Address> ele : address.entrySet()) {
			System.out.println(ele.getKey() + " " + ele.getValue().getCity() + " " + ele.getValue().getState());
		}
		
	}
	public Map<String, Address> getAddress() {
		return address;
	}
	public void setAddress(Map<String, Address> address) {
		this.address = address;
	}
	
	
}
