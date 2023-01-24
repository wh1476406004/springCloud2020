package com.wh.springcloud.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: GooGoo
 * @time: 2023/1/24 21:27
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService{
    @Override
    public String paymentInfo_OK(Integer id) {
        return "paymentInfo_OK  fallback";
    }

    @Override
    public String paymentInfo_timeout(Integer id) {
        return "paymentInfo_timeout  fallback";
    }
}
