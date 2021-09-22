package com.jbk.DemoAnnotation;

import org.springframework.context.annotation.Bean;

public class Config {

	@Bean
	public Employee getInstance() {
		return (new Employee());
	}
	
	
}
