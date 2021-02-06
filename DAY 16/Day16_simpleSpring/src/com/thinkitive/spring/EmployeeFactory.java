package com.thinkitive.spring;

public class EmployeeFactory {
	
	public EmployeeFactory() {
		
		System.out.println("Default Constructor");
	}

	public  Address getInstance()
	{
		System.out.println("Factory method of Another class");
		return new Address();
	}
}
