package com.thinkitive;

public class Employee {
	private int empid;
	private String ename;
	private double base_salary,pf,pt,hra,medical,gross_salary,netsalary;
	
	
	Employee()
	{
		
	}


Employee(int empid, String ename, double base_salary )
{
	super();
	this.empid = empid;
	this.ename = ename;
	this.base_salary = base_salary;
}
	

	public Employee(int empid, String ename, double base_salary, double pf, double pt, double hra, double medical,
			double gross_salary, double netsalary) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.base_salary = base_salary;
		this.pf = pf;
		this.pt = 200;
		this.hra = hra;
		this.medical = medical;
		this.gross_salary = gross_salary;
		this.netsalary = netsalary;
	}


	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + ", base_salary=" + base_salary + ", pf=" + pf + ", pt="
				+ pt + ", hra=" + hra + ", medical=" + medical + ", gross_salary=" + gross_salary + ", netsalary="
				+ netsalary + "]";
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


	public double getPf() {
		return pf;
	}


	public void setPf(double pf) {
		this.pf = pf;
	}


	public double getPt() {
		return pt;
	}


	public void setPt(double pt) {
		this.pt = pt;
	}


	public double getHra() {
		return hra;
	}


	public void setHra(double hra) {
		this.hra = hra;
	}

	
	

	public double getBase_salary() {
		return base_salary;
	}


	public void setBase_salary(double base_salary) {
		this.base_salary = base_salary;
	}


	public double getMedical() {
		return medical;
	}


	public void setMedical(double medical) {
		this.medical = medical;
	}


	public double getGross_salary() {
		return gross_salary;
	}


	public void setGross_salary(double gross_salary) {
		this.gross_salary = gross_salary;
	}


	public double getNetsalary() {
		return netsalary;
	}


	public void setNetsalary(double netsalary) {
		this.netsalary = netsalary;
	}
	
	public double Calc_Hrf() {
		double hrf = 0.5 * base_salary;
		return hrf;
	}

	public double Calc_PF() {

		double pf = 0.12 * base_salary;
		return pf;
	}

	public double Calc_gross_Salary() {
		double gross = base_salary + Calc_Hrf() + medical;
		return gross;
	}

	public double Calc_Net_Salary() {
		double net = Calc_gross_Salary() - pf - pt;
		return net;
	}
	
	
	public void display()
	{
		System.out.println("***Employee Details***\n");
		
		System.out.println("Employee Id: " + empid);
		System.out.println("Employee Name: " + ename);
		System.out.println("Employee Basic Salary : " + base_salary);
		System.out.println("Employee Medical Insurance: " + medical);
		System.out.println("Employee PT: " + pt);
		
		System.out.println("******************************************");
		
		System.out.println("Employee HRA: " + Calc_Hrf());
		System.out.println("Employee PF: " + Calc_PF());
		
		System.out.println("*********************************************");
		System.out.println("Employee Gross Salary: " + Calc_gross_Salary());
		System.out.println("Employee Net Salary: " + Calc_Net_Salary());
	}
	
	
	
}
