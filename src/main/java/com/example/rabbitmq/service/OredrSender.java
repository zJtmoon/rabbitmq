package com.example.rabbitmq.service;

import com.alibaba.fastjson.JSONObject;
import com.example.rabbitmq.RabbitmqApplication;
import com.example.rabbitmq.entity.Order;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author zjt
 * @create 2019-11-19-下午11:44
 * @desc：
 */
@Component
public class OredrSender {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void sendOrder(String order) {
        CorrelationData correlationData = new CorrelationData();
        correlationData.setId("XXXX");//消息唯一的id
        rabbitTemplate.convertAndSend("order-exchange",
                "order.abcd",
                order,//消息提内容
                correlationData
        );
    }
}
