package com.clubdynamics.dto.user;

import com.clubdynamics.dto.contact.ContactTypeDto;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class UserCreateDto {
  
  public UserCreateDto() {}
  
  public UserCreateDto(String username, String password, String email, ContactTypeDto emailContactType) {
    this.username = username;
    this.password = password;
    this.email = email;
    this.emailContactType = emailContactType;
  }

  @NotBlank
  public String username;
  
  @NotBlank
  public String password;
  
  @NotBlank
  public String email;
  
  @NotNull
  public ContactTypeDto emailContactType;
}
