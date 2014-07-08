package com.myPaths.shared;

import java.io.Serializable;

@SuppressWarnings("serial")
public class UserAccountDTO implements Serializable {

  private String id;
  private String name;
  private String emailAddress;

  public UserAccountDTO() {
  
  }

  public UserAccountDTO(String email, String name) {
    this();
    this.setEmailAddress(email);
    this.setName(name);
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

}
