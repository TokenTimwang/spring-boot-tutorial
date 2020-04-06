package com.timwang.cloudserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/*
 * Spring Cloud Configuration Server是一个集中式应用程序，用于管理所有与应用程序相关的配置属性。
 * 配置中心提供的核心功能:
 *   提供服务端和客户端支持
 *   集中管理各环境的配置文件
 *   配置文件修改之后，可以快速的生效
 *   可以进行版本管理
 *   支持大的并发查询
 *   支持各种语言
 * Spring Cloud Config可以完美的支持以上所有的需求
 *
 * 查看配置文件中的配置信息可访问:http://localhost:8116/tim-config-dev.properties
 *
 * http://localhost:8116/tim-config/dev
 * */

@SpringBootApplication
@EnableConfigServer
public class CloudServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudServerApplication.class, args);
    }

}
