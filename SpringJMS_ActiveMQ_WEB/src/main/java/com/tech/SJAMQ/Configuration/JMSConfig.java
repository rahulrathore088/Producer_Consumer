package com.tech.SJAMQ.Configuration;

import javax.jms.ConnectionFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;

@Configuration
@EnableJms
public class JMSConfig {

  @Bean
  public DefaultJmsListenerContainerFactory defaultJmsListenerContainerFactory(ConnectionFactory factory) {
    DefaultJmsListenerContainerFactory listenerContainerFactory = 
        new DefaultJmsListenerContainerFactory();
    listenerContainerFactory.setConnectionFactory(factory);
    listenerContainerFactory.setConcurrency("5");
    return listenerContainerFactory;
  }
  
}
