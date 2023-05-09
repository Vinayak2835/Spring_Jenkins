package com.springjenkins;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsIntegrationApplication {
	
	public static Logger logger = LoggerFactory.getLogger(SpringJenkinsIntegrationApplication.class);
	
	@PostConstruct
	public void init() {
		logger.info("Application started");
	}

	public static void main(String[] args) {
		
		logger.info("Application executing");
		SpringApplication.run(SpringJenkinsIntegrationApplication.class, args);
	}

}
