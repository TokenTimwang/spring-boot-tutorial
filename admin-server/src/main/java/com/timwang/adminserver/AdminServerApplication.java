package com.timwang.adminserver;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * 主Spring Boot应用程序类文件中添加@EnableAdminServer批注。
 * @EnableAdminServer批注用于使您成为Admin Server来监视所有其他微服务。
 * */
@SpringBootApplication
@EnableAdminServer
public class AdminServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdminServerApplication.class, args);
    }

}
