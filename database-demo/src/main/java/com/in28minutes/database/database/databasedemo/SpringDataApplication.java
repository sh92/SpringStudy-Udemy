package com.in28minutes.database.database.databasedemo;


import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.in28minutes.database.database.databasedemo.entity.Person;
import com.in28minutes.database.database.databasedemo.jpa.PersonJpaRepository;
import com.in28minutes.database.database.databasedemo.springdata.PersonSpringDataRepository;

@SpringBootApplication
public class SpringDataApplication implements  CommandLineRunner {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	PersonSpringDataRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(SpringDataApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("User id 10001 -> {}", repository.findById(10001));
		logger.info("Insert 10004 -> {}", 
				repository.save(new Person("Tara", "Berlin", new Date())));
		
		logger.info("Update 10003 -> {}", 
				repository.save(new Person(10003, "Oieter", "Utrecht", new Date())));
		
		repository.deleteById(10002);
		logger.info("Delete id 10002 -> No of Rows Deleted - {}");
		
		logger.info("All users -> {}", repository.findAll());
		
	}
}
