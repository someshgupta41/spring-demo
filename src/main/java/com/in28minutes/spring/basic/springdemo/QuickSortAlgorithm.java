package com.in28minutes.spring.basic.springdemo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("quick")
public class QuickSortAlgorithm implements SortAlgorithm{
	public int [] sort(int [] numbers) {
		// Logic for quick sort
		
		// return the sorted algorithm
		return numbers;
	}

}
