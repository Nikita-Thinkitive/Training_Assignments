package com.thinkitive;

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
		return new Address(411062,"pune");
	}
}
