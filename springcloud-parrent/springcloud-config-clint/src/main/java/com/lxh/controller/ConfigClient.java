package com.lxh.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: 李旭辉
 */
@RestController
public class ConfigClient {

    @Value("${server.port}")
    private String port;

    @Value("${spring.application.name}")
    private String applicationName;


    @GetMapping("/config")
    public String config() {
        String content = "applicationName: " + applicationName + ", port: " + port;
        System.out.println("当前配置为： " + content);
        return content;
    }
}
