package com.lxh.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther: 梦学谷
 */
@Configuration //标识配置类
public class ConfigBean {


    /**
     * 功能描述: 注入RestTemplate组件，RestTemplate组件提供多种访问restful服务的方法，是spring提供的用于访问rest服务的客户端模板工具类
     * url，requesmap，responseBean.class 三个参数分别代表rest请求地址，请求参数默http响应被转化为的对象状态
     * 〈〉
     * @Param:
     * @Return: 
     * @Author: 
     * @Date:  
     */
    @LoadBalanced //实现负载均衡，调用地址ip可以直接是服务名称，
    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }


}
