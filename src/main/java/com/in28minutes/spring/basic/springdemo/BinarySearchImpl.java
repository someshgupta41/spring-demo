package com.in28minutes.spring.basic.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

	@Autowired
	private SortAlgorithm sortAlgorithm;
	
	public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
		this.sortAlgorithm = sortAlgorithm;
	}


	/*
	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}
*/


	public int binarySearch(int [] nums,int numToSearch) {
		//Implement sorting logic
		
		
		
		int [] sortedNumbers = sortAlgorithm.sort(nums);
		System.out.println(sortAlgorithm);
		
		//QuickSort Algorithm
		
		// search the array
		
		
		
		// return the result
		return 3;

	}
	
}
