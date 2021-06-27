package com.tech.SJAMQ.Configuration;

import java.util.Arrays;

import javax.jms.ConnectionFactory;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.support.converter.MessageConverter;
import org.springframework.jms.support.converter.SimpleMessageConverter;

@Configuration
public class MessagingConfiguration {

  private static final String DEFAULT_BROKER_URL = "tcp://localhost:61616";
  private static final String MESSAGE_QUEUE = "message_queue";
  
  @Bean
  public ConnectionFactory connectionFactory() {
    ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory();
    connectionFactory.setBrokerURL(DEFAULT_BROKER_URL);
    connectionFactory.setTrustedPackages(
        Arrays.asList("com.tech"));
    return connectionFactory;
  }
  //JMS Template to Send Message
  @Bean
  public JmsTemplate template() {
    JmsTemplate jmsTemplate = new JmsTemplate();
    jmsTemplate.setConnectionFactory(connectionFactory());
    jmsTemplate.setDefaultDestinationName(MESSAGE_QUEUE);
    return jmsTemplate;
  }
  //Message Convertor
  @Bean
  MessageConverter convertor() {
    return new SimpleMessageConverter();
  }
  
}
