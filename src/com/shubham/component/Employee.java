package com.shubham.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	@Autowired
	@Qualifier("address2")
	private Address address;
	
	public void fullName(){
		
		System.out.println(address.getCity() + " " + address.getState());
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
}
