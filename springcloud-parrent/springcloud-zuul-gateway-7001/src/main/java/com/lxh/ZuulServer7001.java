package com.lxh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Auther: 梦学谷
 */
@EnableZuulProxy //开启zuul的功能
@SpringBootApplication
public class ZuulServer7001 {

    public static void main(String[] args) {
        SpringApplication.run(ZuulServer7001.class, args);
    }

}
