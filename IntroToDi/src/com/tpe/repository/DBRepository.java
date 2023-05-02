package com.tpe.repository;

import com.tpe.domain.Message;

public class DBRepository implements Repo{
    @Override
    public void saveMessage(Message message) {
        System.out.println("Your massaged is saved to Database ...: "+message.getMessage());
    }
}


