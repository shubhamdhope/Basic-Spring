package com.shubham.internationalization;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;


public class Employee {

	/*Commented code is for Internationalization using MessageSource*/
	private int empId;
	private String empName;
	/*@Autowired
	private MessageSource messageSource;*/
	
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
		//System.out.println(messageSource.getMessage("paramMessage", new Object[]{1,2}, "Default", null));
	}
	/*public MessageSource getMessageSource() {
		return messageSource;
	}
	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}*/
	
}
