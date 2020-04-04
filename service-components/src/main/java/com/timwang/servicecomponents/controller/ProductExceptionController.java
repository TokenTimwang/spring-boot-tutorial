package com.timwang.servicecomponents.controller;

import com.timwang.servicecomponents.exception.ProductNotfoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @ Author  : Tim Wang
 * @ FileName: ProductExceptionController.java
 * @ Time    : 2020/4/5 2:12
 */

@ControllerAdvice
public class ProductExceptionController {

    @ExceptionHandler(value = ProductNotfoundException.class)
    public ResponseEntity<Object> exception(ProductNotfoundException exception){
        return new ResponseEntity<>("Product not found", HttpStatus.NOT_FOUND);
    }
}
