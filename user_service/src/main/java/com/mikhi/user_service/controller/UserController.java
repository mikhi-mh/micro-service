package com.mikhi.user_service.controller;

import com.mikhi.user_service.model.Contact;
import com.mikhi.user_service.model.UserEntity;
import com.mikhi.user_service.service.UserService;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/user")
public class UserController {

  @Autowired
  UserService userService;

  @Autowired
  RestTemplate restTemplate;

//  @GetMapping("/{id}")
//  public ResponseEntity<UserEntity> getUserById(@PathVariable Long id){
//    return ResponseEntity.ok(userService.getUser(id));
//  }

  @GetMapping("/{id}")
  public UserEntity getUserById(@PathVariable Long id){
    UserEntity user = userService.getUser(id);

    Object temp = this.restTemplate.getForObject("http://localhost:8586/contact/" + id, Object.class);
    List<Contact> list = new ArrayList<Contact>(
    return user;
  }


}
