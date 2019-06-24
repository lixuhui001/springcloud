package com.lxh.dao;

import com.lxh.entity.Product;

import java.util.List;

/**
 * @Auther: 李旭辉
 */
//@Mapper //或者在启动类上标识 @MapperScan
public interface ProductMapper {

    Product findById(Long pid);

    List<Product> findAll();

    boolean addProduct(Product product);
}