package com.timwang.internationa.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ Author  : Tim Wang
 * @ FileName: ViewController.java
 * @ Time    : 2020/4/5 21:51
 */

/*
* 国际化是一个过程，可以使您的应用程序适应不同的语言和地区，而无需在源代码上进行工程更改。换句话说，国际化是本地化的准备
* 我们需要Spring Boot Starter Web和Spring Boot Starter Thymeleaf依赖性来在Spring Boot中开发Web应用程序。
* 我们需要确定您的应用程序的默认语言环境。我们需要在我们的Spring Boot应用程序中添加LocaleResolver bean。
* LocaleChangeInterceptor用于根据添加到请求中的language参数的值来更改新的Locale。
*
* */
@RestController
public class ViewController {

    @RequestMapping(value = "/locale")
    public String locale(){
        return "locale";
    }
}
