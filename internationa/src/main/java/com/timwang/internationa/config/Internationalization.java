package com.timwang.internationa.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import java.util.Locale;

/**
 * @ Author  : Tim Wang
 * @ FileName: Internationalization.java
 * @ Time    : 2020/4/5 21:53
 */
/*
* 为了实现此效果，我们需要将LocaleChangeInterceptor添加到应用程序的注册表拦截器中。配置类应扩展WebMvcConfigurer类，
* 并重写addInterceptors（）方法。
* */
@Configuration
public class Internationalization implements WebMvcConfigurer {

    @Bean
    public SessionLocaleResolver localeResources() {
        SessionLocaleResolver sessionLocaleResolver = new SessionLocaleResolver();
        sessionLocaleResolver.setDefaultLocale(Locale.US);
        return sessionLocaleResolver;
    }

    @Bean
    public LocaleChangeInterceptor localeChangeInterceptor() {
        LocaleChangeInterceptor localeChangeInterceptor = new LocaleChangeInterceptor();
        localeChangeInterceptor.setParamName("language");

        return localeChangeInterceptor;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(localeChangeInterceptor());
    }
}
