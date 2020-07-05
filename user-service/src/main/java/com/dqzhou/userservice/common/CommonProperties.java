package com.dqzhou.userservice.common;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: DonnieZhou
 * @Mail: dqzhou5180@foxmail.com
 * @Create 2020-04-25 15:05
 **/
@Component
@Data
@ConfigurationProperties(prefix = "user-center.common")
public class CommonProperties {

    private String redisPrefix;
}
