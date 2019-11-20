//package com.example.rabbitmq.config;
//
//import org.springframework.amqp.core.AmqpTemplate;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
///**
// * @author zjt
// * @desc： 添加一个消息发送类（生产者）  将消息发送至默认的交换机且routingKey为notify.payment
// * @Date create in 2019-11-17
// */
//@Component
//public class PaymentNotifySender {
//    @Autowired
//    private AmqpTemplate rabbitTemplate;
//
//    public void sender(String msg){
//        rabbitTemplate.convertAndSend("notify.payment", msg);
//    }
//}