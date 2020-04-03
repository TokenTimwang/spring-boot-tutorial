package com.timwang.springlogging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringLoggingApplication {

    private static final Logger logger = LoggerFactory.getLogger(SpringLoggingApplication.class);

    public static void main(String[] args) {
        logger.info("this is a info message");
        logger.warn("this is warn message");
        logger.error("this is error message");
        SpringApplication.run(SpringLoggingApplication.class, args);
    }

}
