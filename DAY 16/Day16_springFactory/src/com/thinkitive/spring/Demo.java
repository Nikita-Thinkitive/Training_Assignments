package com.thinkitive.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	public static void main(String[] args) {
		//OBJECT CREATION FROM SPRINGS
		ApplicationContext context=new ClassPathXmlApplicationContext("anyone.xml");
		
		Employee e=context.getBean("emp",Employee.class);//create singleton object
		
	/*	e.Display();
		e.setEid(1);
		e.setName("virat");*/
		System.out.println(e);
		System.out.println(e.hashCode());
		
		
		
		Employee e1=context.getBean("emp",Employee.class); //Autowiring
		
		//e1.Display(); //getting value from bean
		System.out.println(e1); //using list from bean
		
		
		
		
	}

}
