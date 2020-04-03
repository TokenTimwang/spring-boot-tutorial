package com.timwang.beaninjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 *使用Spring Framework定义我们的bean及其依赖项注入。该@ComponentScan注释用于查找Bean，
 * 然后将相应的注射@Autowired注解。
 * 如果遵循Spring Boot的典型布局，则无需为@ComponentScan注释指定任何参数。
 * 所有组件类文件都将自动注册到Spring Beans。
 */

@SpringBootApplication
public class BeanInjectionApplication {

    @Autowired
    RestTemplate restTemplate;

    public static void main(String[] args) {
        SpringApplication.run(BeanInjectionApplication.class, args);
    }

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

}
