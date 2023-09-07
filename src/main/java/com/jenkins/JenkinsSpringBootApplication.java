package com.jenkins;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsSpringBootApplication {
	
	public static Logger loggers = LoggerFactory.getLogger(JenkinsSpringBootApplication.class);
	
	@PostConstruct
	public void init() {
		loggers.info("jenkinsSpringBootApplication started");
	}

	public static void main(String[] args) {
		loggers.info("jenkinsSpringBootApplication executed");
		SpringApplication.run(JenkinsSpringBootApplication.class, args);
	}

}
