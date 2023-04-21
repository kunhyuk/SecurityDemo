package com.genspark.SecurityDemo.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="tbl_users")
public class User {
    @Id
    @Column(name="p_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId;
    private String userName;
    private String password;
    public User() {

    }

    public User(int userId, String userName, String password) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
