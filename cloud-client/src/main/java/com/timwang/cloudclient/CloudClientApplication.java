package com.timwang.cloudclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
* 使用该注解的类，会在接到SpringCloud配置中心配置刷新的时候，
* 自动将新的配置更新到该类对应的字段中。
* */

@SpringBootApplication
@RestController
@RefreshScope
public class CloudClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudClientApplication.class, args);
    }

    @Value("${welcome.message}")
    private String welcomeTest;

    @RequestMapping(value = "/message")
    public String welcomeTest(){
        return this.welcomeTest;
    }
}
