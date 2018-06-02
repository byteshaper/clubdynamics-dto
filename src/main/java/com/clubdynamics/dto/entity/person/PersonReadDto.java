package com.clubdynamics.dto.entity.person;

public class PersonReadDto extends PersonWriteDto {

  public long id;

  public PersonReadDto() {

  }
  
  public PersonReadDto(long id, String firstName, String lastName, String middleNames, String birthday) {
    super(firstName, lastName, middleNames, birthday);
    this.id = id;
  }
}
