package com.timwang.springwebservices.controller;

import com.timwang.springwebservices.exception.ProductNotfoundException;
import com.timwang.springwebservices.model.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @ Author  : Tim Wang
 * @ FileName: ProductServiceController.java
 * @ Time    : 2020/4/4 2:20
 */

@RestController
public class ProductServiceController {
    private static Map<String, Product> productMap = new HashMap<>();

    static {

        Product honey = new Product();
        honey.setId("1");
        honey.setName("Honey");
        productMap.put(honey.getId(), honey);

        Product almond = new Product();
        almond.setId("2");
        almond.setName("Almond");
        productMap.put(almond.getId(), almond);

    }

    // 删除 delete
    @RequestMapping(value = "/products/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Object> delete(@PathVariable("id") String id) {

        productMap.remove(id);

        return new ResponseEntity<>("Product is deleter successfully", HttpStatus.OK);
    }

    // 更新 update
    @RequestMapping(value = "/products/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Object> updateProduct(@PathVariable("id") String id,
                                                @RequestBody Product product) {
        // 判断是否有这个id , 如果没有, 则返回异常
        if (!productMap.containsKey(id)) throw new ProductNotfoundException();
        productMap.remove(id);
        product.setId(id);
        productMap.put(id, product);

        return new ResponseEntity<>("Product is updated successfully", HttpStatus.OK);
    }

    // 增加 create
    @RequestMapping(value = "/products", method = RequestMethod.POST)
    public ResponseEntity<Object> createProduct(@RequestBody Product product) {

        productMap.put(product.getId(), product);

        return new ResponseEntity<>("Product is created successfully", HttpStatus.CREATED);
    }

    //查询 Retrieve
    @RequestMapping(value = "/products")
    public ResponseEntity<Object> getProduct() {
        return new ResponseEntity<>(productMap.values(), HttpStatus.OK);
    }
}
