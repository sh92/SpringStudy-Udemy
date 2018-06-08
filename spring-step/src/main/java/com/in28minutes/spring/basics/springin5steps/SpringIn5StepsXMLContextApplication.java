package com.in28minutes.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.in28minutes.spring.basics.springin5steps.xml.XmlPersonDAO;

@Configuration
@ComponentScan
public class SpringIn5StepsXMLContextApplication {
	
	//What are the beans?
	//what are the dependencies of a bean?
	//Where to search for beans? -> No need
	private static Logger LOGGER =LoggerFactory.getLogger(SpringIn5StepsScopeApplication.class);
	
	public static void main(String[] args) {
//		BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
//		ConfigurableApplicationContext applicationContext = 
//				new AnnotationConfigApplicationContext(SpringIn5StepsBasicApplication.class);	
//				SpringApplication.run(SpringIn5StepsBasicApplication.class, args);
		
		try(ClassPathXmlApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("applicationContext.xml")) {
			
			LOGGER.info("Beans Loaded -> {}",
					(Object)applicationContext.getBeanDefinitionNames());
			
			applicationContext.getBeanDefinitionNames();
			
			XmlPersonDAO personDao = applicationContext.getBean(XmlPersonDAO.class);
			System.out.println(personDao);
			System.out.println(personDao.getXmlJdbcConnection());
		}
	}
}
