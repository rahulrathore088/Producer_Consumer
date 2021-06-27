package com.tech.SJAMQ.Consumer;

import javax.jms.JMSException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.jms.support.converter.MessageConversionException;

import com.tech.SJAMQ.Configuration.AppConfig;

public class MessageReceiverApp {

  public static void main(String... s) throws MessageConversionException, JMSException {
    AbstractApplicationContext cxt = new AnnotationConfigApplicationContext(AppConfig.class);
    MessageConsumer messageConsumer = (MessageConsumer) cxt.getBean(MessageConsumer.class);
    String response = messageConsumer.consumeMessage();
    System.out.println("Message Received = " + response);
    ((AbstractApplicationContext) cxt).close();
  }

}
