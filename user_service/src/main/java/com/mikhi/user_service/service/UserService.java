package com.mikhi.user_service.service;

import com.mikhi.user_service.model.UserEntity;
import org.springframework.stereotype.Service;


public interface UserService {

  public UserEntity getUser(Long id);
}
