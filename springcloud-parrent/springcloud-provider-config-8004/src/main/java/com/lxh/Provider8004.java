package com.lxh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Configuration;

@EnableHystrix //开启Hystrix的熔断机制
@EnableEurekaClient
@SpringBootApplication
@RefreshScope
@Configuration
@MapperScan("com.lxh.dao")
public class Provider8004 {
    public static void main(String[] args) {
        SpringApplication.run(Provider8004.class);
    }
}
