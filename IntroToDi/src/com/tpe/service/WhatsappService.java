package com.tpe.service;

import com.tpe.domain.Message;

public class WhatsappService implements  MessageService {

    @Override
    public void sendMessage(Message message){
        System.out.println("I am WhatsappService . I am sending you this message" +message.getMessage());

    }

    @Override
    public void saveMessage(Message message) {

    }
}
