package com.in28minutes.spring.basics.springin5steps.basic;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component("quick")
public class QuickSortAlgorithm implements SortAlgorithm{
	public int[] sort(int[] numbers) {
		return numbers;
	}
}
