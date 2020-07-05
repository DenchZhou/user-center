package com.dqzhou.userservice.util.Lock.impl;

import com.dqzhou.userservice.util.Lock.DistributedLock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: DonnieZhou
 * @Mail: dqzhou5180@foxmail.com
 * @Create 2020-05-30 22:28
 **/
@Component
public class RedisDistributedLock implements DistributedLock {

    @Autowired
    private RedisTemplate redisTemplate;

    public String acquire () {

        return null;
    }

    public String releaseLock() {
        return null;
    }
}
