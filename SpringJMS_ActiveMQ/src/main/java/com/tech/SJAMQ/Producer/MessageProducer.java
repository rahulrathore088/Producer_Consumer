package com.tech.SJAMQ.Producer;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.ObjectMessage;
import javax.jms.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

@Component
public class MessageProducer {

  @Autowired
  JmsTemplate jmsTemplate;
  
  public void produceMessage(final String message) {
    jmsTemplate.send(new MessageCreator() {
      
      @Override
      public Message createMessage(Session session) throws JMSException {
        return  (ObjectMessage)session.createObjectMessage(message);
      }
    });
  }
}
