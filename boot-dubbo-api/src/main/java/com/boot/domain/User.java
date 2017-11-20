package com.boot.domain;

import java.io.Serializable;
//import lombok.Data;
/**
 * Created by lin on 2017/11/19.
 */
//@Data
public class User implements Serializable{
    public Integer id;
    public String username;
    public String password;
    public Integer age;
    public Integer gender;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }
}
