package com.wh.springcloud.controller;

import com.wh.springcloud.entities.CommonResult;
import com.wh.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @description:
 * @author: GooGoo
 * @time: 2023/1/17 15:10
 */
@RestController
@Slf4j
public class OrderZKController {

    public static final String INVOKE_URL = "http://cloud-payment-service";

    @Autowired
    private RestTemplate restTemplate;


    @GetMapping("/consumer/payment/zk")
    public String paymentInfo(){
       return restTemplate.getForObject(INVOKE_URL+"/payment/zk",String.class);
    }

}
