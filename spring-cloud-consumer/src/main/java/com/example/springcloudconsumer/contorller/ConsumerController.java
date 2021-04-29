package com.example.springcloudconsumer.contorller;


import com.example.springcloudconsumer.feign.ProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    ProviderClient providerClient;

    @GetMapping("/getProviderMessage")
    public String getProviderMessage() {
        return providerClient.getMessage("ssss");
    }
}
