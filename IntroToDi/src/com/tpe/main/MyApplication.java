package com.tpe.main;

import com.tpe.domain.Message;
import com.tpe.repository.DBRepository;
import com.tpe.repository.FileRepository;
import com.tpe.repository.Repo;
import com.tpe.service.MailService;
import com.tpe.service.MessageService;
import com.tpe.service.SMSService;
import com.tpe.service.WhatsappService;

public class MyApplication {
    public static void main(String[] args) {
        // create Object from message classs
        Message message = new Message();
        message.setMessage("Orders have been submitted to cargo ...");
        ////"**************** LEVEL 1 ******************
        // i want to message with MailService
//        MailService mailService = new MailService();
//        mailService.sendMessage(message);
//
//        SMSService smsService = new SMSService();
//        smsService.sendMessage(message);
//
//        WhatsappService whatsappService = new WhatsappService();
//        whatsappService.sendMessage(message);

        //it was working fine ,but instead of mailService,SMSService,WhatsappService , we want to send message Using Interface
        // i want to message with SMSService

        // this is better to use Interface , but let make improvement : we will decide on RunTime which service to use .
//        MessageService smsService = new MailService();
//        smsService.sendMessage(message);

        ////"**************** LEVEL 2 ******************

        // but let make improvement : we will decide on RunTime which service to use .
//        String serviceName ="mailService";
//        MessageService service;
//
//        if (args.length>0){
//            serviceName = args[0];
//        }
//        if (serviceName.equalsIgnoreCase("smsService")){
//            service = new SMSService();
//        } else if (serviceName.equalsIgnoreCase("whatsappService")) {
//            service= new WhatsappService();
//
//        }else {
//            service = new MailService();
//        }
//        service.sendMessage(message);

        ////"**************** LEVEL 3 ******************

        Repo repo = new DBRepository();
        MessageService mailService = new SMSService(repo);
        mailService.sendMessage(message);
        mailService.saveMessage(message);

        // in this task
                // w tried to have loosely coupling
        //1- used interface instead create of concrete class .
        //2  we used DI(Dependency Injection )




    }
}
