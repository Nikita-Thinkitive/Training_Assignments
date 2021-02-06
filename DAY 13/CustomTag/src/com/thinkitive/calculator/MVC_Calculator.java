package com.thinkitive.calculator;

public class MVC_Calculator 
{
	private int num1,num2;
	
	public MVC_Calculator(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public int add(int a, int b)
	{
	return a+b;
	}
	
	public int sub(int a, int b)
	{
	return a-b;
	}
	
	public int div(int a, int b)
	{
	return a/b;
	}

	
	public int multiply(int a, int b)
	{
	return a*b;
	}


}
