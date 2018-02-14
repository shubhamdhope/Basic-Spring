package com.shubham.initdestbean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee implements InitializingBean, DisposableBean {
	private int empId;
	private String empName;

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

	public void fullName() {
		System.out.println(empId + "  " + empName);
	}

	// for perticular bean
	public void init() {
		System.out.println("In init method");
	}
	// for perticular bean
	public void dest() {
		System.out.println("In dest method");
	}

	public void destroy() throws Exception {
		System.out.println("In destroy method");
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("In afterPropertiesSet method");
	}

}
