package com.thinkitive.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class Employee {
	private int empid;
	private String name;
	private int salary;
	@Autowired
	private Address address;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int empid, String name, int salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}

	public Employee(int empid, String name, int salary, Address address) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
		this.address = address;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + ", address=" + address + "]";
	}


	

}
