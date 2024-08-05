package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ch.qos.logback.core.Context;

public class XmlconfDemo {

	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		
		for(String string : context.getBeanDefinitionNames()) {
			System.out.println(string);
		}
		
		Employee emp = context.getBean("emp", Employee.class);
		System.out.println(emp.getEmpName());
	}
}
