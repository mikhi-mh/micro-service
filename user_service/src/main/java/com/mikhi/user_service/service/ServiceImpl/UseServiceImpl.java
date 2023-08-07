package com.mikhi.user_service.service.ServiceImpl;

import com.mikhi.user_service.model.UserEntity;
import com.mikhi.user_service.service.UserService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class UseServiceImpl implements UserService {

  List<UserEntity> list = Arrays.asList(
      new UserEntity(1L, "Alice", "1234567890", new ArrayList<>()),
      new UserEntity(2L, "Bob", "0987654321", new ArrayList<>()),
      new UserEntity(3L, "Charlie", "1112223333", new ArrayList<>()),
      new UserEntity(4L, "Dave", "4445556666", new ArrayList<>()),
      new UserEntity(5L, "Eve", "7778889999", new ArrayList<>()),
      new UserEntity(6L, "Frank", "0001112222", new ArrayList<>()),
      new UserEntity(7L, "Grace", "3334445555", new ArrayList<>())
  );

  @Override
  public UserEntity getUser(Long id) {
    return list.stream().filter(user -> user.getUserId().equals(id)).findAny()
        .orElse(null);
  }

}
