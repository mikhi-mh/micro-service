package com.mikhi.user_service.controller;

import com.mikhi.user_service.model.UserEntity;
import com.mikhi.user_service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

  @Autowired
  UserService userService;

//  @GetMapping("/{id}")
//  public ResponseEntity<UserEntity> getUserById(@PathVariable Long id){
//    return ResponseEntity.ok(userService.getUser(id));
//  }

  @GetMapping("/{id}")
  public UserEntity getUserById(@PathVariable Long id){
    return userService.getUser(id);
  }

}
