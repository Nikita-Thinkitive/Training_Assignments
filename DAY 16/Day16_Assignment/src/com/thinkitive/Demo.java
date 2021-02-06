package com.thinkitive;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;





public class Demo {
	public static void main(String[] args) {
		

			ApplicationContext context=new ClassPathXmlApplicationContext("anyone.xml");
			
			
			Employee e=context.getBean("emp",Employee.class);//create singleton object
			e.display();
			
			//USING ANNOTATION
			
			/*
			 *ApplicationContext context1=new AnnotationConfigApplicationContext("com.thinkitive");
			Employee e1=context1.getBean(Employee.class);
			e1.display();
			System.out.println(e1);
			 */

	}
}
