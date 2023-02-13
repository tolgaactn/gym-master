package com.pinsoft.gym.service;

import com.pinsoft.gym.dto.UserDto;
import com.pinsoft.gym.model.User;

import java.util.List;

public interface UserService {
    UserDto createUser (UserDto user);
    List<User> getUsers();
    User getUser(int id);
    User updateUser(int id,User user);
    boolean deleteUser(int id);
}
