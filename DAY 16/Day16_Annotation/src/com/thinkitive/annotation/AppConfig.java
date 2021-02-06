package com.thinkitive.annotation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
	
	public AppConfig() {
		
	}
	
	@Bean
	@Scope(scopeName = "prototype")
	
	public Employee getEmployee()
	{
		System.out.println("THIS IS ANNOTATION");
		return new Employee(1,"nik",3000);
	}

	@Bean
	@Scope(scopeName = "prototype")
	public Address getAddress()
	{
		
		List al=new ArrayList<Address>();
		al.add("pune");
		al.add("mumbai");
		return new Address(411062,"pune",al);
	}
}
