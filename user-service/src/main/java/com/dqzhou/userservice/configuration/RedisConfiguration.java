package com.dqzhou.userservice.configuration;

import com.dqzhou.userservice.common.RedisProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;
import redis.clients.jedis.JedisPoolConfig;

import java.util.HashSet;
import java.util.Set;

/**
 * @Description:
 * @Author: DonnieZhou
 * @Mail: dqzhou5180@foxmail.com
 * @Create 2020-06-01 14:36
 **/
@Configuration
public class RedisConfiguration {

    @Autowired
    RedisProperties redisProperties;

    @Bean
    public JedisCluster jedisCluster () {
        Set<HostAndPort> set = new HashSet<>();
        String[] node = redisProperties.getNodes().split(",");
        for (String hostAndPort : node) {
            String host = hostAndPort.split(":")[0];
            int port = Integer.parseInt(hostAndPort.split(":")[1]);
            set.add(new HostAndPort(host,port));
        }
        JedisPoolConfig config=new JedisPoolConfig();
        config.setMaxTotal(redisProperties.getMaxTotal());
        config.setMaxIdle(redisProperties.getMaxIdle());
        config.setMinIdle(redisProperties.getMinIdle());
        return new JedisCluster(set, config);
    }

}
