package com.jenkins;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsSpringBootApplicationTests {

	public static Logger loggers = LoggerFactory.getLogger(JenkinsSpringBootApplicationTests.class);

	@Test
	void contextLoads() {
		loggers.info("test cases executings");
		loggers.info("test cases executings second log statement");
		assertEquals(true, true);
	}

}
