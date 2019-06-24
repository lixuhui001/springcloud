package com.lxh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Auther: 李旭辉
 */
@EnableConfigServer
@SpringBootApplication
public class ConfigServer5001 {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServer5001.class, args);
    }

}
