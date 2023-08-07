package com.mikhi.user_service.model;

import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
public class UserEntity {

  private Long userId;
  private String name;
  private String phone;

  private List<Contact> contacts = new ArrayList<>();

  public UserEntity() {
  }

  public UserEntity(Long userId, String name, String phone, List<Contact> contacts) {
    this.userId = userId;
    this.name = name;
    this.phone = phone;
    this.contacts = contacts;
  }

  public UserEntity(Long userId, String name, String phone) {
    this.userId = userId;
    this.name = name;
    this.phone = phone;
  }
}
