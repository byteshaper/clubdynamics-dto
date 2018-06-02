package com.clubdynamics.dto.entity.login;

public class LoginResultDto {
  
  public String jwtToken;
  
  public LoginResultDto() {}
  
  public LoginResultDto(String jwtToken) {
    this.jwtToken = jwtToken;
  }
}
