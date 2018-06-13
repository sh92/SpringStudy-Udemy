package com.in28minutes.database.database.databasedemo;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.in28minutes.database.database.databasedemo.entity.Person;
import com.in28minutes.database.database.databasedemo.jdbc.PersonJdbcDao;

@SpringBootApplication
public class DatabaseDemoApplication implements  CommandLineRunner {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	PersonJdbcDao dao;

	public static void main(String[] args) {
		SpringApplication.run(DatabaseDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("All users -> {}", dao.findAll());
		logger.info("User id 10001 -> {}", dao.findById(10001));
		logger.info("User id 10002 -> No of Rows Deleted - {}",
				dao.deleteById(10002));
		logger.info("Insert 10004 -> {}", 
				dao.insert(new Person(10004, "Tara", "Berlin", new Date())));
		
		logger.info("Update 10003 -> {}", 
				dao.update(new Person(10003, "Oieter", "Utrecht", new Date())));
	}
}
