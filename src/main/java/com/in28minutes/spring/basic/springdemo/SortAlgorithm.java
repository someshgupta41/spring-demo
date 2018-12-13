package com.in28minutes.spring.basic.springdemo;

public interface SortAlgorithm {
	public default int [] sort( int [] numbers) {
		return numbers;
	}

}
