package com.timwang.adminclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*
* 为了通过Spring Boot Admin Server监视和管理您的微服务应用程序，
* 您应该添加Spring Boot Admin入门客户端依赖项，
* 并在应用程序属性文件中指出Admin Server URI。
*
* 通过上图可以看出，Spring Boot Admin 以图形化的形式展示了应用的各项信息，
* 这些信息大多都来自于 Spring Boot Actuator 提供的接口。
*
* */
@SpringBootApplication
public class AdminClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdminClientApplication.class, args);
    }

}
