package com.tech.SJAMQ.publishController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tech.SJAMQ.Model.SystemMessageSender;

@RestController

public class PulishController {

  @Autowired
  private JmsTemplate jmsTemplate;

  @PostMapping("/publisgMsg")
  public ResponseEntity<String> publishMessage(@RequestBody SystemMessageSender messageSender) {
    try {
      jmsTemplate.convertAndSend("message-queue", messageSender);
      return new ResponseEntity<>("Sent", HttpStatus.OK);
    } catch (Exception e) {
      return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }
}
