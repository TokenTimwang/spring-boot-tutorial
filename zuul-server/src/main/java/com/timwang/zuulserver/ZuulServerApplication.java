package com.timwang.zuulserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
/*
* Zuul Server是一个网关应用程序,
* 它处理所有请求并进行微服务应用程序的动态路由。Zuul服务器也称为边缘服务器。
* 主Spring Boot应用程序上添加@EnableZuulProxy批注。
* @EnableZuulProxy批注用于使您的Spring Boot应用程序充当Zuul代理服务器。
* 意味着对/api/demo/的http调用将转发到产品服务。例如/api/demo/products被转发到/products。
* 注 - 在通过Zuul代理进行路由之前, http://localhost:8095/应用程序应该已经在运行。
*
* */

@SpringBootApplication
@EnableZuulProxy
public class ZuulServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZuulServerApplication.class, args);
    }

}
