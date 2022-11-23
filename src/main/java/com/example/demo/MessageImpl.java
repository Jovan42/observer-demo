package com.example.demo;

import org.springframework.stereotype.Component;
import rs.xfinity.observer.anotations.Topic;
import rs.xfinity.observer.interfaces.Message;

@Topic(name = {"test"})
public class MessageImpl extends Message {

    private String message;


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
