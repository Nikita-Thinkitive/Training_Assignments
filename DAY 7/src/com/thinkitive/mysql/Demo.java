package com.thinkitive.mysql;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Demo {
	//REFLECTION APIS
	public static void main(String[] args) {
		
		try {
			Class c=Class.forName("com.thinkitive.threading.MyThread"); //Load the class
		
			Field f[]=c.getFields(); //for getting public members
			
			Field f1[]=c.getDeclaredFields(); //For getting private members
			
			for(Field x:f1)
			{
				System.out.println(x.getName());
			}
		
		for(Field x:f)
		{
			System.out.println(x.getName());
		}
		
		Method m[]=c.getDeclaredMethods(); //for getting private methods
		
		for(Method x: m)
		{
			System.out.println(x.getName());
		}
		
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	}

}
