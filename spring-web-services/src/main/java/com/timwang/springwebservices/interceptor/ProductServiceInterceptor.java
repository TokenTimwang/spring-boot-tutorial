package com.timwang.springwebservices.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ Author  : Tim Wang
 * @ FileName: ProductServiceInterceptor.java
 * @ Time    : 2020/4/4 14:10
 */


/*
* 您可以使用拦截器在将请求发送到控制器之前添加请求标头，并在将响应发送到客户端之前添加响应标头。
要使用拦截器，您需要创建支持它的@Component类，并且它应该实现HandlerInterceptor接口。
* */

@Component
public class ProductServiceInterceptor implements HandlerInterceptor {


    /**
     *拦截器, 用于在将请求发送到控制器之前执行操作。此方法应返回true，以将响应返回给客户端。
     */

    @Override
    public boolean preHandle
            (HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        System.out.println("Pre Handle method is Calling");
        return true;
    }

    /**
     *拦截器, 用于在将响应发送到客户端之前执行操作
     */

    @Override
    public void postHandle
            (HttpServletRequest request, HttpServletResponse response, Object handler,
             ModelAndView modelAndView)
            throws Exception {
        System.out.println("Post Handle method is Calling");

    }

    /**
     *拦截器, 用于完成请求和响应后执行操作。
     */

    @Override
    public void afterCompletion(HttpServletRequest request,
                                HttpServletResponse response, Object handler, Exception ex)
            throws Exception {
        System.out.println("Request and Response is completed");

    }
}
