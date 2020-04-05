package com.timwang.registrationeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/*
* 我们需要在主Spring Boot应用程序类文件中添加@EnableDiscoveryClient批注。
* @EnableDiscoveryClient注释使您的Spring Boot应用程序充当Eureka客户端。
* https://juejin.im/post/5d78cd53f265da03d55e8351
* */
@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class RegistrationEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(RegistrationEurekaApplication.class, args);
    }

    @RequestMapping(value = "/")
    public String home() {
        return "Eureka Client application";
    }
}
