package com.in28minutes.spring.springdemo.scope;

import org.springframework.stereotype.Component;

@Component
public class JdbcConnection {
	
	public JdbcConnection() {
		System.out.println("JdbcConnection !!");
	}

}
