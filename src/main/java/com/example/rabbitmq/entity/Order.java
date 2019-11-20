package com.example.rabbitmq.entity;

import java.io.Serializable;

/**
 * @author zjt
 * @create 2019-11-19-下午11:39
 * @desc：
 */
public class Order implements Serializable {
    private String id;
    private String name;
    //存储消息发送的唯一id，消息发送时会生成一个唯一的id
    private String messageId;

    public Order() {
    }

    public Order(String id, String name, String messageId) {
        this.id = id;
        this.name = name;
        this.messageId = messageId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

}
