package com.thinkitive.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext("com.thinkitive.annotation");
		Employee e=context.getBean(Employee.class);
		System.out.println(e);
	}

}
