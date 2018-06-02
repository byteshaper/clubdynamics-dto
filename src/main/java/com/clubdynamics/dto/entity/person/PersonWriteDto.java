package com.clubdynamics.dto.entity.person;

import javax.validation.constraints.NotBlank;

public class PersonWriteDto {
  
  public PersonWriteDto() {
  }
  
  public PersonWriteDto(String firstName, String lastName, String middleNames, String birthday) {
    this.birthday = birthday;
    this.firstName = firstName;
    this.lastName = lastName;
    this.middleNames = middleNames;
  }
  
  @NotBlank
  public String firstName;
  
  @NotBlank
  public String lastName;
  
  public String middleNames;
  
  public String birthday;
}
