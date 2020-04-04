package com.timwang.springwebservices.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.FormatterRegistry;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @ Author  : Tim Wang
 * @ FileName: ProductServiceInterceptorAppConfig.java
 * @ Time    : 2020/4/4 14:17
 */

@Component
public class ProductServiceInterceptorAppConfig implements WebMvcConfigurer {

    @Autowired
    ProductServiceInterceptor productServiceInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(productServiceInterceptor);
    }

    @Override
    public void addFormatters(FormatterRegistry registry) {

    }
}
