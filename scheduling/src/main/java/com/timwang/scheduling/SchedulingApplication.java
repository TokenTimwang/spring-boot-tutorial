package com.timwang.scheduling;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/*
 * 调度是在特定时间段内执行任务的过程。Spring Boot为在Spring应用程序上编写调度程序提供了良好的支持。
 * @EnableScheduling批注用于为您的应用程序启用调度程序。该注释应添加到主Spring Boot应用程序类文件中。
 *
 * */

@SpringBootApplication
@EnableScheduling
public class SchedulingApplication {

    public static void main(String[] args) {
        SpringApplication.run(SchedulingApplication.class, args);
    }
}
