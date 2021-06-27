package com.tech.SJAMQ.Model;

import java.io.Serializable;

public class SystemMessageSender implements Serializable {

  private static final long serialVersionUID = 1L;
  private String source;
  private String message;

  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  @Override
  public String toString() {
    return "SystemMessageSender [source=" + source + ", message=" + message + "]";
  }

}
