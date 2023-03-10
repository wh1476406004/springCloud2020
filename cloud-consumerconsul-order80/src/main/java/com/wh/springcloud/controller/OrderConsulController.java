package com.wh.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @description:
 * @author: GooGoo
 * @time: 2023/1/17 15:10
 */
@RestController
@Slf4j
public class OrderConsulController {

    public static final String INVOKE_URL = "http://cloud-providerconsul-payment";

    @Autowired
    private RestTemplate restTemplate;


    @GetMapping("/consumer/payment/consul")
    public String paymentInfo(){
       return restTemplate.getForObject(INVOKE_URL+"/payment/consul",String.class);
    }

}
