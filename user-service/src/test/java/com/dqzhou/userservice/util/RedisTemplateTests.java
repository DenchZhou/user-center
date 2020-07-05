package com.dqzhou.userservice.util;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import redis.clients.jedis.JedisCluster;

/**
 * @Description:
 * @Author: DonnieZhou
 * @Mail: dqzhou5180@foxmail.com
 * @Create 2020-05-30 11:27
 **/
@SpringBootTest
public class RedisTemplateTests {

    Logger logger = LoggerFactory.getLogger(RedisTemplateTests.class);

    @Autowired
    private JedisCluster jedisCluster;

    @Test
    void testGet() {
        String value = jedisCluster.get("kobe");
        logger.info("redis value is {}", value);
    }

}
