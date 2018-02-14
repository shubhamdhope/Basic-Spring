package com.shubham.inheritance;

public class EmployeeProject {
	private String proName;
	private String empName;
	private String empId;
	public String getProName() {
		return proName;
	}

	public void setProName(String proName) {
		this.proName = proName;
	}
	
	public void printDetails(){
		System.out.println(empId + " " + empName + " " +proName);
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}
	
}
