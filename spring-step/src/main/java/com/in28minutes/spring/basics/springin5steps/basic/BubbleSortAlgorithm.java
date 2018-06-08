package com.in28minutes.spring.basics.springin5steps.basic;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component("bubble")
public class BubbleSortAlgorithm implements SortAlgorithm{
	public int[] sort(int[] numbers) {
		return numbers;
	}
}
