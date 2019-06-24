package com.lxh.dao;

import com.lxh.entity.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Auther: 梦学谷
 */
//@Mapper //或者在启动类上标识 @MapperScan
public interface ProductMapper {

    Product findById(Long pid);

    List<Product> findAll();

    boolean addProduct(Product product);
}