package com.timwang.servicecomponents.controller;

import com.timwang.servicecomponents.model.Product;
import com.timwang.servicecomponents.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @ Author  : Tim Wang
 * @ FileName: ProductServiceController.java
 * @ Time    : 2020/4/5 1:52
 */

@RestController
public class ProductServiceController {

    @Autowired
    ProductService productService;

    @RequestMapping(value = "/products")
    public ResponseEntity<Object>
    getProduct() {
        return new ResponseEntity<>(productService.getProducts(), HttpStatus.OK);
    }

    @RequestMapping(value = "/products/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Object>
    updateProduct(@PathVariable("id") String id,
                  @RequestBody Product product) {
        productService.updateProduct(id, product);
        return new ResponseEntity<>("Product is updated successfully", HttpStatus.OK);

    }

    @RequestMapping(value = "/products", method = RequestMethod.POST)
    public ResponseEntity<Object>
    createProduct(@RequestBody Product product) {
        productService.createProduct(product);
        return new ResponseEntity<>("Product is create successfully", HttpStatus.OK);
    }

    @RequestMapping(value = "/products/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Object>
    deleteProduct(@PathVariable("id") String id) {
        productService.deleteProduct(id);

        return new ResponseEntity<>("Product is delete successfully", HttpStatus.OK);
    }
}
