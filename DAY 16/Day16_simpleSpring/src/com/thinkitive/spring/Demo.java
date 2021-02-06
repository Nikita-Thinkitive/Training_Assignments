package com.thinkitive.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	public static void main(String[] args) {
		//OBJECT CREATION FROM SPRINGS
		ApplicationContext context=new ClassPathXmlApplicationContext("anyone.xml");
		
		Employee e=context.getBean("emp",Employee.class);//create singleton object
		
		e.Display();
		e.setEid(1);
		e.setName("virat");
		e.setSalary(3000);
		System.out.println(e);
		System.out.println(e.hashCode());
		
		
		
		Employee e1=context.getBean("emp1",Employee.class); //creating another bean for same class
		
		e1.Display(); //getting value from bean
		System.out.println(e1); //using list from bean
		
		System.out.println(e.hashCode());//create only one object 
		
		Address add=context.getBean("add",Address.class);
		add.dispaddress();
		
		System.out.println(add);//calling contructor through bean
		
		
		
		
		//***CALLING FACTORY METHODS OF SAME CLASS***
		
		Employee emp=context.getBean("emp2",Employee.class);//create singleton object
		
		System.out.println("\n\nCalling Factory method of SAME class");
		System.out.println(emp);
		
		//***CALLING FACTORY METHODS OF ANOTHER CLASS***
		
		System.out.println("\n\nCalling Factory method of ANOTHER class");
		//calling contructor through bean
		
		Address ad=context.getBean("add",Address.class);
		System.out.println(ad);
		
		//CALLING LIST OF ANOTHER CLASS
		System.out.println("\n\nCalling VARIABLE OF ANOTHER CLASS");
		Address a=context.getBean("add",Address.class);
		System.out.println(a);
		
		
		
		
		
		
	}

}
