package com.example.springcloudprovider1.service;

import com.example.springcloudprovider1.entity.User;
import com.example.springcloudprovider1.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserDao userDao;

    public List<User> getAllUser(){
        return userDao.getAllUser();
    }

    public User SelectUserById(Integer id){
        return userDao.SelectUserById(id);
    }

    public int addUser(User user) {
        return userDao.addUser(user);
    }

    public int updateUserById(User user){
        return userDao.updateUserById(user);
    }

    public int deleteUserById(Integer id){
        return userDao.deleteUserById(id);
    }
}
