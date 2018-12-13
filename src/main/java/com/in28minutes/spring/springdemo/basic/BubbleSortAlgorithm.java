package com.in28minutes.spring.springdemo.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bubble")
public class BubbleSortAlgorithm implements SortAlgorithm {
	public int [] sort(int [] numbers) {
		// Logic for bubble sort
		
		// return the sorted algorithm
		return numbers;
	}

}
