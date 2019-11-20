//package com.example.rabbitmq.config;
//
//import org.springframework.amqp.core.Queue;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//
///**
// * @author zjt
// * @desc：添加一个配置类（消费者）
// * 配置一个routingKey为notify.payment的消息队列
// * @Date create in 2019-11-17
// */
//@Configuration
//public class DirectConfig {
//    @Bean
//    public Queue paymentNotifyQueue() {
//        return new Queue("notify.payment");
//    }
//}
//
