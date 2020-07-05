package com.dqzhou.usersdk;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.apache.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@EnableDubboConfig
@SpringBootApplication
public class UserSdkApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserSdkApplication.class, args);
    }

}
