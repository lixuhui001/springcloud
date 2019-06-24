package com.lxh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = "com.lxh.service")
@EnableEurekaClient
@SpringBootApplication
public class Consumer8081 {
    public static void main(String[] args) {
        SpringApplication.run(Consumer8081.class);
    }
}
