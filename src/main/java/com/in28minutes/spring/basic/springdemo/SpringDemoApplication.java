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
		BinarySearchImpl binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);
		
		
		// singleton bean
		// same bean for every request because there is 
		// one instance per Spring Context
		System.out.println(binarySearch);
		System.out.println(binarySearch1);
		
		// by default every bean is singleton or @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
		
		
		// com.in28minutes.spring.basic.springdemo.BinarySearchImpl@3e792ce3
		// com.in28minutes.spring.basic.springdemo.BinarySearchImpl@3e792ce3
		
		
		// by putting @Scope("prototype") or @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
		// different beans for very request
		
		
		// com.in28minutes.spring.basic.springdemo.BinarySearchImpl@7a34b7b8
		// com.in28minutes.spring.basic.springdemo.BinarySearchImpl@58cd06cb
		
		int result = binarySearch.binarySearch(new int [] {124, 6} , 6);
		System.out.print(result);
		
		
		
	}

}

