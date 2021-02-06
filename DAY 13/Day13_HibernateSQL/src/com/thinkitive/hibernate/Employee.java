package com.thinkitive.hibernate;

public class Employee {
	private int empid;
	private String ename;
	private int salary;
	Employee()
	{
		
	}
	public int getEid() {
		return empid;
	}
	public void setEid(int eid) {
		this.empid = eid;
	}
	public String getName() {
		return ename;
	}
	public void setName(String name) {
		this.ename = ename;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empid;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empid != other.empid)
			return false;
		return true;
	}
	public Employee(int eid, String name, int salary) {
		super();
		this.empid = eid;
		this.ename = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return " [eid=" + empid + ", name=" + ename + ", salary=" + salary + "]";
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	

}
