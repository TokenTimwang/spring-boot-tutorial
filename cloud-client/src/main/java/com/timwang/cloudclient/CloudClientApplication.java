package com.timwang.cloudclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CloudClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudClientApplication.class, args);
    }

    @Value("${welcome.message}")
    String welcomeTest;

    @RequestMapping(value = "/message")
    public String welcomeTest(){
        return this.welcomeTest;
    }
}
