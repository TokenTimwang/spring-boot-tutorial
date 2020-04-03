package com.timwang.introduction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Spring Boot Application的入口点是包含@SpringBootApplication批注的类。
 * 此类应具有运行Spring Boot应用程序的main方法。
 * 其中@SpringBootApplication批注包括自动配置, 组件扫描和Spring Boot配置。
 * 如果在类中添加了@SpringBootApplication批注，
 * 则无需添加@EnableAutoConfiguration(自动配置:Spring Boot Auto Configuration根据您在项目中添加的JAR依赖项自动配置Spring应用程序),
 * 则无需添加@ComponentScan(组件扫描:初始化时，Spring Boot应用程序会扫描所有Bean和包声明) 和
 * 则无需添加@SpringBootConfiguration批注。 该@SpringBootApplication注释包括所有其他的注解。
 */

/*
 *要在Spring Boot Application主类文件本身中编写一个简单的Hello World Rest Endpoint，
 *请按照以下步骤操作-
 * 1.首先，在类顶部添加@RestController批注。
 * 2.现在，编写带有@RequestMapping批注的Request URI方法。
 * 3.然后，Request URI方法应返回Hello World字符串。
 */
@SpringBootApplication
@RestController
public class IntroductionApplication {

    public static void main(String[] args) {
        SpringApplication.run(IntroductionApplication.class, args);
    }

    @RequestMapping(value = "/")
    public String hello() {
        return "Hello World";
    }
}
