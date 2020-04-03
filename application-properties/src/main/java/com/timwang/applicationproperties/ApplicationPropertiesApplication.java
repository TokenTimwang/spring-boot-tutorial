package com.timwang.applicationproperties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ApplicationPropertiesApplication {

    /**
     * 注 -如果在运行应用程序时未找到该属性，则Spring Boot会抛出Illegal Argument异常，
     * 因为无法解析值“ $ {spring.application.name}”中的占位符'spring.application.name'。
     * 要解决占位符问题，我们可以使用下面给出的thr语法为属性设置默认值-
     * @ Value("${property_key_name:default_value}")
     * @ Value("${spring.application.name:demoservice}")
     */
    @Value("${spring.application.name}")
    private String name;

    public static void main(String[] args) {
        SpringApplication.run(ApplicationPropertiesApplication.class, args);
    }

    @RequestMapping(value = "/")
    public String name() {
        return name;
    }
}
