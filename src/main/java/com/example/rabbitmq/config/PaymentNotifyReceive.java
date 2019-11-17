package com.example.rabbitmq.config;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author zjt
 * @desc： 添加一个消息监听类（消费者）  监听routingKey为notify.payment的队列消息
 * @Date create in 2019-11-17
 */
@Component
@RabbitListener(queues = "notify.payment")
public class PaymentNotifyReceive {
    @RabbitHandler
    public void receive(String msg) {
//        LogUtil.info("notify.payment receive message: "+msg);
        System.out.println("notify.payment receive message: "+msg);
    }
}