package com.thinkitive.spring;

import java.util.List;
import java.util.Set;

public class Employee {
	private int eid;
	private String name;
	private int salary;
	private List skills;
	private Set sub;
	
	private Employee()
	{
		
	}

	public Employee(int eid, String name, int salary) {
		super();
		this.eid = eid;
		this.name = name;
		this.salary = salary;
	}

	public Employee(int eid, String name, int salary, List skills) {
		super();
		this.eid = eid;
		this.name = name;
		this.salary = salary;
		this.skills = skills;
	}

	public Employee(int eid, String name, int salary, List skills, Set sub) {
		super();
		this.eid = eid;
		this.name = name;
		this.salary = salary;
		this.skills = skills;
		this.sub = sub;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
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

	
	public List getSkills() {
		return skills;
	}

	public void setSkills(List skills) {
		this.skills = skills;
	}

	
	
	public Set getSub() {
		return sub;
	}

	public void setSub(Set sub) {
		this.sub = sub;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", salary=" + salary + ", skills=" + skills + ", sub=" + sub
				+ "]";
	}

	public void Display()
	{
		System.out.println("HELLO SPRING...");
	}
	
	private static Employee getFactory()
	{
		System.out.println("This is Factory method");
		return new Employee();
	}



}
