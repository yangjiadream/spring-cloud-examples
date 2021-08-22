package com.example.springcloudprovider1.dao;

import com.example.springcloudprovider1.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
    List<User> getAllUser();

    User SelectUserById(Integer id);

    int addUser(User user);

    int updateUserById(User user);

    int deleteUserById(Integer id);
}
