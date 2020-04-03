package com.timwang.tomcatdeployment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 1.创建一个war文件来部署到Web服务器中, 需要扩展SpringBootServletInitializer类以支持WAR文件部署
 * 2.设置主类,
 * Maven，在pom.xml属性中添加start类: <start-class>com.timwang.tomcatdeployment.TomcatDeploymentApplication</start-class>
 * Gradle，在build.gradle中添加主类名称: mainClassName="com.timwang.tomcatdeployment.TomcatDeploymentApplication"
 * 3.将包装JAR更新为WAR
 * Maven，将包装作为WAR添加到pom.xml: <packaging>war</packaging>
 * Gradle，在build.gradle中添加应用程序插件和war插件:
 * apply plugin: ‘war’
 * apply plugin: ‘application’
 */
@SpringBootApplication
@RestController
public class TomcatDeploymentApplication extends SpringBootServletInitializer {


    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(TomcatDeploymentApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(TomcatDeploymentApplication.class, args);
    }

    @RequestMapping(value = "/")
    public String hello(){
        return "Hello World from Tomcat";
    }

}
