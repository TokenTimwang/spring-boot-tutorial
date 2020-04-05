package com.timwang.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
/*
* 在Spring Boot Application主类文件中下载项目后，
* 我们需要添加@EnableEurekaServer批注。
* @EnableEurekaServer批注用于使您的Spring Boot应用程序充当Eureka Server。
*
* */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }

}
