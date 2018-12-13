package com.in28minutes.spring.basic.springdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDemoApplication {

	
	// what are the beans ?
	// what are the dependencies of a bean ?
	// Where to search for beans ?
	
	public static void main(String[] args) {
		
		//BinarySearchImpl binarySearch = 
		//new BinarySearchImpl(new QuickSortAlgorithm());
		
		
		//Application Context
		// get the bean from the application context
		ApplicationContext  applicationContext = SpringApplication.run(SpringDemoApplication.class, args);
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		
		int result = binarySearch.binarySearch(new int [] {124, 6} , 6);
		System.out.print(result);
		
		
		
	}

}

