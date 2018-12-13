package com.in28minutes.spring.springdemo.basic;

public interface SortAlgorithm {
	public default int [] sort( int [] numbers) {
		return numbers;
	}

}
