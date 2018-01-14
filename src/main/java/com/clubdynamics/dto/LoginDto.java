package com.clubdynamics.dto;

import javax.validation.constraints.NotBlank;

public class LoginDto {
  
  @NotBlank
  public String username;
  
  @NotBlank
  public String password;
  
  public LoginDto() {}
  
  public LoginDto(String username, String password) {
    this.username = username;
    this.password = password;
  }
}
