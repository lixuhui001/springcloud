package com.lxh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;

@EnableEurekaServer//标识这是一个Eureka服务端
@SpringBootApplication
@ComponentScan
public class EurecaServer6001 {
    public static void main(String[] args) {
        SpringApplication.run(EurecaServer6001.class,args);
    }
}
