package com.example.rabbitmq.service;

import com.alibaba.fastjson.JSONObject;
import com.rabbitmq.client.Channel;
import org.springframework.amqp.rabbit.annotation.*;
import org.springframework.amqp.support.AmqpHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Map;

/**
 * @author zjt
 * @create 2019-11-20-上午11:48
 * @desc：
 */
@Component
public class OrderReceive {
    @RabbitHandler
    @RabbitListener(bindings = @QueueBinding(value = @Queue(value = "order-queue",durable = "true"),
                                             exchange = @Exchange(value = "order-exchage",durable = "true",type = "topic"),
                                             key = "order.*"))
    public void onOrderMessage(@Payload String string, @Headers Map<String,Object> headers, Channel channel) {
        System.out.println("------------------收到消息，开始消费-----------------");
        System.out.println("订单-----"+string);
        Long deliveryTag= (Long) headers.get(AmqpHeaders.DELIVERY_TAG);
        //ACK，因为是手动模式，必须手动发送ack
        try {
            channel.basicAck(deliveryTag,false);
        } catch (IOException e) {

        }
    }
}
