package com.lxh.service;

import com.lxh.entity.Product;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Auther: 李旭辉
 */
//Caused by: java.lang.IllegalStateException: No fallback instance of type class com.lxh.service.ProductClientServiceFallBack found for feign client lxh-provider
@Component //一定要加上它,将它纳入到容器中
public class ProviderClientServiceFallBack implements ProviderClientService{


    @Override
    public boolean add(Product product) {
        return false;
    }

    @Override
    public Product get(Long id) {
        return new Product(id, "id=" + id + "无数据--@feignclient&hystrix", "无有效数据库");
    }

    @Override
    public List<Product> list() {
        return null;
    }
}
