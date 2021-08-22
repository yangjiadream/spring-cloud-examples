package com.example.springcloudprovider1.controller;

import com.example.springcloudprovider1.entity.User;
import com.example.springcloudprovider1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public List<User> getAllUser() {
        return userService.getAllUser();
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public User getUser(@PathVariable Integer id) {
        return userService.SelectUserById(id);
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public String addUser(@RequestBody User user) {
        return String.valueOf(userService.addUser(user));
    }

    @RequestMapping(value = "/user", method = RequestMethod.PUT)
    public String updateUserById(@RequestBody User user) {
        return String.valueOf(userService.updateUserById(user));
    }

    @RequestMapping(value = "/user/{id}",method = RequestMethod.DELETE)
    public String deleteUserById(@PathVariable Integer id) {
        return String.valueOf(userService.deleteUserById(id));
    }
}
