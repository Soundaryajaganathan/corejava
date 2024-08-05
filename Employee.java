package com.example.demo;

public class Employee {

	private String empName;
	
	private Company company;
	
	public Employee(String empName, Company company) {
		this.empName=empName;
		this.company=company;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
}
