package com.thinkitive;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Appconfig {
	
	@Bean
	@Scope(scopeName = "prototype")
	public Employee getEmployee()
	{
		return new Employee(1, "nik", 4000);
	}
	

}
