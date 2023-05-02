package com.tpe.service;

import com.tpe.domain.Message;
import com.tpe.repository.DBRepository;
import com.tpe.repository.FileRepository;
import com.tpe.repository.Repo;

public class SMSService implements  MessageService{
    private Repo repo; // create a fled from repo to injection


    // generate constructor  from Repo to sent Message
    public SMSService(Repo repo) {
        this.repo = repo;
    }

    public void sendMessage(Message message){
        System.out.println("I am SMS Service  . I am sending you this message" +message.getMessage());

    }

    @Override
    public void saveMessage(Message message) {
      // Repo repo = new FileRepository();
        repo.saveMessage(message);
    }
}
