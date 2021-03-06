package com.lxh.service;

import com.lxh.entity.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Auther: 李旭辉
 */
// fallback 作用，指定熔断处理类，如果被调用的方法处理异常，就会交给熔断处理类中的方法进行处理

@FeignClient(value = "lxh-provider", fallback = ProviderClientServiceFallBack.class) //指定调用的微服务名称
public interface ProviderClientService {

    @RequestMapping(value = "/product/add", method = RequestMethod.POST)
    boolean add(@RequestBody Product product);

    @RequestMapping(value = "/product/get/{id}", method = RequestMethod.GET)
    Product get(@PathVariable("id") Long id);

    @RequestMapping(value = "/product/list", method = RequestMethod.GET)
    List<Product> list();

}
