package com.genspark.SecurityDemo.Dao;

import com.genspark.SecurityDemo.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Integer> {

}
