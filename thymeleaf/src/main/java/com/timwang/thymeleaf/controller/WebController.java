package com.timwang.thymeleaf.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ Author  : Tim Wang
 * @ FileName: WebController.java
 * @ Time    : 2020/4/5 10:16
 */

/*
 * 您可以使用Thymeleaf模板在Spring Boot中创建Web应用程序。
 * 您将必须按照以下步骤使用Thymeleaf在Spring Boot中创建Web应用程序。
 * 使用以下代码创建@Controller类文件，以将请求URI重定向到HTML文件-
 * */

@RestController
public class WebController {

    @RequestMapping(value = "/index")
    public String index() {
        return "index";
    }
}
