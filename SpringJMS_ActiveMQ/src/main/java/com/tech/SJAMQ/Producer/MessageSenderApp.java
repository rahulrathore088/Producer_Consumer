package com.tech.SJAMQ.Producer;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.tech.SJAMQ.Configuration.AppConfig;

public class MessageSenderApp {

  public static void main(String[] args) {
    AbstractApplicationContext context =
        new AnnotationConfigApplicationContext(AppConfig.class);
    MessageProducer messageProducer = context.getBean(MessageProducer.class);
    messageProducer.produceMessage("Hi Rahul, How are you?");
    System.out.println("Message has been sent successfully....");
    ((AbstractApplicationContext) context).close();
  }

}
