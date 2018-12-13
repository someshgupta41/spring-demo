package com.in28minutes.spring.basic.springdemo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuickSortAlgorithm implements SortAlgorithm{
	public int [] sort(int [] numbers) {
		// Logic for quick sort
		
		// return the sorted algorithm
		return numbers;
	}

}
