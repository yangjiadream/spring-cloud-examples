package com.example.springcloudconsumer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("service-provider")
public interface ProviderClient {

    @GetMapping("/getMessage")
    String getMessage(@RequestParam(value = "name", defaultValue = "yangjia", required = false) String name);
}