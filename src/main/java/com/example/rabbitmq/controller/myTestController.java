//package com.example.rabbitmq.controller;
//
//import com.example.rabbitmq.config.PaymentNotifySender;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
///**
// * @author zjt
// * @create 2019-11-18-下午7:15
// * @desc：
// */
//@RestController
//public class myTestController {
//    @Autowired
//    private PaymentNotifySender sender;
//    @RequestMapping("/test")
//    public void test_sender() {
//        System.out.println("======");
//        sender.sender("支付订单号："+System.currentTimeMillis());
//    }
//}
