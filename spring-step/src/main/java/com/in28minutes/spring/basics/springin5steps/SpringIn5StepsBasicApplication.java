package com.in28minutes.spring.basics.springin5steps;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.in28minutes.spring.basics.springin5steps.basic.BinarySearchImpl;

//@SpringBootApplication
@Configuration
@ComponentScan
public class SpringIn5StepsBasicApplication {
	
	//What are the beans?
	//what are the dependencies of a bean?
	//Where to search for beans? -> No need
	
	public static void main(String[] args) {
//		BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
//		ConfigurableApplicationContext applicationContext = 
//				new AnnotationConfigApplicationContext(SpringIn5StepsBasicApplication.class);
		
//				SpringApplication.run(SpringIn5StepsBasicApplication.class, args);
		try(AnnotationConfigApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(
						SpringIn5StepsBasicApplication.class)) {
			BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
			BinarySearchImpl binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);
			System.out.println(binarySearch);
			System.out.println(binarySearch1);
			
			int result = binarySearch.binarySearch(new int[] {12, 4, 6}, 3);
			System.out.println(result);
		}
	}
}
