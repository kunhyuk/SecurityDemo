package com.genspark.SecurityDemo.controller;

import com.genspark.SecurityDemo.Entity.User;
import com.genspark.SecurityDemo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/home")
public class MyController {
    @Autowired
    private UserService userService;
    @GetMapping("/public")
    public String publicUser() {
        return "<HTML><H1>I am a public user. I can't do anything</H1></HTML>";
    }
    @GetMapping("/admin")
    public String adminUser() {
        return "<HTML><H1>I am a admin user. I can edit, delete, or check users.</H1></HTML>";
    }
//    @GetMapping("/normal")
//    public String normalUser() {
//        return "<HTML><H1>I am a normal user</H1></HTML>";
//    }
    @GetMapping("/admin/users")
    public List<User> getUsers() {
        return this.userService.getAllUser();
    }
    @GetMapping("/admin/users/{userId}")
    public User getUser(@PathVariable String userId) {
        return this.userService.getUserById(Integer.parseInt(userId));
    }
    @PostMapping("/admin/users")
    public User addUser(@RequestBody User user) {
        return this.userService.addUser(user);
    }
    @DeleteMapping("/admin/users/{userId}")
    public String deleteUser(@PathVariable String userId) {
        return this.userService.deleteUserById(Integer.parseInt(userId));
    }
    @PutMapping("/admin/users")
    public User updateUser(@RequestBody User user) {
        return this.userService.updateUser(user);
    }


}
