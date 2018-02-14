package com.shubham.constructor;

public class Employee {
	private int empId;
	private String empName;
	
	public Employee(int empId, String empName){
		this.empId = empId;
		this.empName = empName;
	}
	public void fullName(){
		System.out.println(empId + "  " + empName);
	}
	
	
}
