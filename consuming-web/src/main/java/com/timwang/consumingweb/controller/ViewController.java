package com.timwang.consumingweb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ Author  : Tim Wang
 * @ FileName: ViewController.java
 * @ Time    : 2020/4/5 11:34
 */

@RestController
public class ViewController {
    @RequestMapping(value = "/view-products")
    public String viewProducts(){
        return "view-products";
    }
    @RequestMapping(value = "/add-products")
    public String addProduct(){
        return "add-products";
    }
}
