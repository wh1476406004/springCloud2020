package com.wh.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @description:
 * @author: GooGoo
 * @time: 2023/1/26 14:01
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderNacosMain83 {


    public static void main(String[] args) {
        SpringApplication.run(OrderNacosMain83.class, args);
    }


}
