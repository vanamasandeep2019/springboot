package com.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CourseAPI {
	
	public static void main(String[] args) {
		
		/*
		
		1) Sets up default configuration

		2) Starts spring application context

		3) Performs class path scan

		4) Starts tomcat server */


		
		SpringApplication.run(CourseAPI.class, args);
	}

}
