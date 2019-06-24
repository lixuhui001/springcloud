package com.lxh.service;


import com.lxh.entity.Product;

import java.util.List;

/**
 * @Auther: 李旭辉
 */
public interface ProductService {

    boolean add(Product product);

    Product get(Long id);

    List<Product> list();

}
