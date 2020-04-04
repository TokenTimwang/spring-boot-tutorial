package com.timwang.servicecomponents.service.Impl;

import com.timwang.servicecomponents.exception.ProductNotfoundException;
import com.timwang.servicecomponents.model.Product;
import com.timwang.servicecomponents.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @ Author  : Tim Wang
 * @ FileName: ProductServiceImpl.java
 * @ Time    : 2020/4/5 1:32
 */

@Service
public class ProductServiceImpl implements ProductService {

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

    @Override
    public void createProduct(Product product) {
        productMap.put(product.getId(), product);
    }

    @Override
    public void updateProduct(String id, Product product) {

        // 判断是否有这个id , 如果没有, 则返回异常
        if (!productMap.containsKey(id)) throw new ProductNotfoundException();
        productMap.remove(id);
        product.setId(id);
        productMap.put(id, product);

    }

    @Override
    public void deleteProduct(String id) {
        productMap.remove(id);

    }

    @Override
    public Collection<Product> getProducts() {
        return productMap.values();
    }
}
