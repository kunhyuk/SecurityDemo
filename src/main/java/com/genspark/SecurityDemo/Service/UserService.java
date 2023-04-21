package com.genspark.SecurityDemo.Service;

import com.genspark.SecurityDemo.Entity.User;

import java.util.List;

public interface UserService {
    List<User> getAllUser();
    User getUserById(int userId);
    User addUser(User user);
    User updateUser(User user);
    String deleteUserById(int userId);
}
