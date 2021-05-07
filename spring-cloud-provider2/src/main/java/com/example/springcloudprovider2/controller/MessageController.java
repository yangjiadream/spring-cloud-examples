package com.example.springcloudprovider2.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class MessageController {

    @Value("${message:默认的message}")
    private String message;

    @GetMapping("/getMessage")
    public String getMessage(@RequestParam(value = "name", defaultValue = "yangjia", required = false) String name) {
        return "service-provider2:" + name + message;
    }
}
