package com.wh.springcloud.service.impl;

import com.wh.springcloud.dao.PaymentDao;
import com.wh.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @description:
 * @author: GooGoo
 * @time: 2023/1/13 16:20
 */
@Service
public class PaymentServiceImpl {
    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
