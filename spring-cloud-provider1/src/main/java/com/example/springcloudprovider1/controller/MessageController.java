package com.example.springcloudprovider1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @GetMapping("/getMessage")
    public String getMessage(@RequestParam(value = "name", defaultValue = "yangjia", required = false) String name) {
        return "hi:" + name + " I'm Provider1";
    }
}
