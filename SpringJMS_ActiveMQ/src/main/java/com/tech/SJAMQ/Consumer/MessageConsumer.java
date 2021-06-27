package com.tech.SJAMQ.Consumer;

import javax.jms.JMSException;
import javax.jms.Message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.support.converter.MessageConversionException;
import org.springframework.jms.support.converter.MessageConverter;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {
  
  @Autowired
  JmsTemplate jmsTemplate;
  
  @Autowired
  MessageConverter messageConverter;
  
  public String consumeMessage() throws MessageConversionException, JMSException {
    Message message = jmsTemplate.receive();
    String response = (String) messageConverter.fromMessage(message);
    return response;
  }

}
