package com.mikhi.user_service.model;

import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserEntity {

  private Long userId;
  private String name;
  private String phone;

  private List<Contact> contacts = new ArrayList<>();
}
