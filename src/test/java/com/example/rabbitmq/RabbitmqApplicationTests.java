package com.example.rabbitmq;

import com.alibaba.fastjson.JSON;
import com.example.rabbitmq.entity.Order;
import com.example.rabbitmq.service.OredrSender;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class RabbitmqApplicationTests {
//
    @Autowired
    private OredrSender oredrSender;
    @Test
    public  void testSend1(){
        Order order=new Order();
        order.setId("1");
        order.setName("测试订单1");
        order.setMessageId(System.currentTimeMillis()+"");
        String s= JSON.toJSONString(order);
        oredrSender.sendOrder(s);

    }
    @Test
    void contextLoads() {
        System.out.println("====");
    }

}
