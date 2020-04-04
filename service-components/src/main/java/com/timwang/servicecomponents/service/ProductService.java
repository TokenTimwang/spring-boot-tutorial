package com.timwang.servicecomponents.service;

import com.timwang.servicecomponents.model.Product;

import java.util.Collection;

/**
 * @ Author  : Tim Wang
 * @ FileName: ProductService.java
 * @ Time    : 2020/4/5 1:32
 */
public interface ProductService {

    public abstract void createProduct(Product product);

    public abstract void updateProduct(String id, Product product);

    public abstract void deleteProduct(String id);

    public abstract Collection<Product> getProducts();

}
