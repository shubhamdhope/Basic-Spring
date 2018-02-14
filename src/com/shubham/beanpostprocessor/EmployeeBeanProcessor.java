package com.shubham.beanpostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class EmployeeBeanProcessor implements BeanPostProcessor, BeanFactoryPostProcessor {

	public Object postProcessAfterInitialization(Object bean, String arg1)
			throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("After: " + arg1);
		return bean;
	}

	public Object postProcessBeforeInitialization(Object bean, String arg1)
			throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("Before: " + arg1);
		return bean;
	}

	public void postProcessBeanFactory(ConfigurableListableBeanFactory arg0)
			throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("Inside postProcessBeanFactory...");
		
	}

}
