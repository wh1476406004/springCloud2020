package com.wh.springcloud.service;

import com.wh.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @description:
 * @author: GooGoo
 * @time: 2023/1/13 16:19
 */
public interface PaymentService {
    public int create(Payment payment);
    public Payment getPaymentById(@Param("id") Long id);
}
