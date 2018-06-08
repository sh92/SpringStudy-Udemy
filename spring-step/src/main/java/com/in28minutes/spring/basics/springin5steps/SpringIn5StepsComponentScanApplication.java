package com.in28minutes.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.in28minutes.spring.basics.componentscan.ComponentDAO;

//@SpringBootApplication
//@ComponentScan("com.in28minutes.spring.basics.componentscan")
@Configuration
@ComponentScan
public class SpringIn5StepsComponentScanApplication {

	private static Logger LOGGER = 
			LoggerFactory.getLogger(SpringIn5StepsComponentScanApplication.class);
	
	public static void main(String[] args) {

		ConfigurableApplicationContext applicationContext = 
				SpringApplication.run(SpringIn5StepsComponentScanApplication.class, args);
		
		ComponentDAO componetDao = 
				applicationContext.getBean(ComponentDAO.class);
		ComponentDAO componetDao2 = 
				applicationContext.getBean(ComponentDAO.class);
		
		
		LOGGER.info("{}", componetDao);
		LOGGER.info("{}", componetDao.getJdbcConnection());

		
	}
}
