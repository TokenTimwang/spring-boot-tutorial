package com.timwang.runners;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1.应用程序运行器
 * 通过应用程序运行器和命令行运行器接口，您可以在启动Spring Boot应用程序后执行代码。
 * 您可以使用这些界面在应用程序启动后立即执行任何操作。
 * 实现Application Runner 接口
 * 2.命令行运行器
 * 命令行运行程序是一个界面。Spring Boot应用程序启动后，用于执行代码。
 * 给出的示例显示了如何在主类文件上实现Command Line Runner接口
 */

//@SpringBootApplication
//public class RunnersApplication implements ApplicationRunner {
//
//    public static void main(String[] args) {
//        SpringApplication.run(RunnersApplication.class, args);
//    }
//
//    @Override
//    public void run(ApplicationArguments args) throws Exception {
//        System.out.println("Hello World from Application Runner");
//    }
//}

@SpringBootApplication
public class RunnersApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(RunnersApplication.class, args);

    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello world from Command Line Runner");
    }
}
