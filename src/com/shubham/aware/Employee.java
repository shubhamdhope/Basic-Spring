package com.shubham.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Employee implements ApplicationContextAware, BeanNameAware{
	private int empId;
	private String empName;
	private ApplicationContext context;
	
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
	}

	public void setApplicationContext(ApplicationContext context)
			throws BeansException {
		// TODO Auto-generated method stub
		this.context = context;
		System.out.println("In setApplicationContext");
	}
	public void setBeanName(String beanName) {
		// TODO Auto-generated method stub
		System.out.println("Bean Name: " + beanName);
	}
	
	
}
