package com.tech.SJAMQ.Consumer.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.tech.SJAMQ.Model.SystemMessageSender;

@Component
public class MessageConsumer {

  private static final Logger logger = LoggerFactory.getLogger(MessageConsumer.class);

  @JmsListener(destination = "message-queue")
  public void messageListener(SystemMessageSender messageSender) {
    logger.info("Message received {} ", messageSender);
  }
}
