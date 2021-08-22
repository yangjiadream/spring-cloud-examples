package com.example.springcloudprovider1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.springcloudprovider1.dao")
public class SpringCloudProvider1Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudProvider1Application.class, args);
    }

}
