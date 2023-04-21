package com.genspark.SecurityDemo.Service;

import com.genspark.SecurityDemo.Dao.UserDao;
import com.genspark.SecurityDemo.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;

    @Override
    public List<User> getAllUser() {
        return this.userDao.findAll();
    }

    @Override
    public User getUserById(int userId) {
        Optional<User> p = this.userDao.findById(userId);
        User user = null;
        if (p.isPresent()) {
            user = p.get();
        } else {
            throw new RuntimeException("Product not found for id: " + userId);
        }
        return user;
    }

    @Override
    public User addUser(User user) {
        return this.userDao.save(user);
    }

    @Override
    public User updateUser(User user) {
        return this.userDao.save(user);
    }

    @Override
    public String deleteUserById(int userId) {
        this.userDao.deleteById(userId);
        return "DELETED USER: " + userId;
    }
}
