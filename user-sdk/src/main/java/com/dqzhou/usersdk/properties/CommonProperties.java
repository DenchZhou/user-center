package com.dqzhou.usersdk.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: DonnieZhou
 * @Mail: dqzhou5180@foxmail.com
 * @Create 2020-04-25 15:33
 **/
@Component
@Data
@ConfigurationProperties(prefix = "user-sdk.common")
public class CommonProperties {

    private String region;

}
