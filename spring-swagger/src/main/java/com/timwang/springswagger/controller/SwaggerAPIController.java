package com.timwang.springswagger.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @ Author  : Tim Wang
 * @ FileName: SwaggerAPIController.java
 * @ Time    : 2020/4/7 1:41
 */

@RestController
public class SwaggerAPIController {

    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public List<String> getProducts(){
        List<String> productList = new ArrayList<>();
        productList.add("Honey");
        productList.add("Almond");
        return productList;
    }

    @RequestMapping(value = "/products", method = RequestMethod.POST)
    public String createProducts(){
        return "Product is saved successfully";
    }
}
