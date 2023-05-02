package com.tpe.service;


import com.tpe.domain.Message;
import com.tpe.repository.DBRepository;
import com.tpe.repository.FileRepository;
import com.tpe.repository.Repo;

public class MailService implements MessageService{

    private Repo repo; // create a fled from repo to injection


    // generate constructor  from Repo to sent Message
    public MailService(Repo repo) {
        this.repo = repo;
    }

    @Override
    public void sendMessage(Message message) {
        System.out.println("I am MailService . I am sending you this message" +message.getMessage());
    }

    @Override
    public void saveMessage(Message message) {
       // Repo repo = new DBRepository();
        repo.saveMessage(message);
    }
}
