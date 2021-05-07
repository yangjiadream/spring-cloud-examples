package com.example.springcloudconsumer.contorller;


import com.example.springcloudconsumer.feign.ProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConsumerController {

    @Autowired
    ProviderClient providerClient;

    @Value("${name:默认name}")
    String name;

    @GetMapping("/getProviderMessage")
    public String getProviderMessage() {
        return providerClient.getMessage("ssss");
    }
}
