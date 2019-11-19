package com.example.rabbitmq;

import com.example.rabbitmq.config.PaymentNotifySender;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class RabbitmqApplicationTests {
//    @Autowired
//    private PaymentNotifySender sender;

//    @Test
//    public void test_sender() {
//        sender.sender("支付订单号："+System.currentTimeMillis());
//    }
    @Test
    void contextLoads() {
        System.out.println("====");
    }

}
