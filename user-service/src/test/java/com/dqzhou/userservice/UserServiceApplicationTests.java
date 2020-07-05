package com.dqzhou.userservice;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.dqzhou.userservice.common.CommonProperties;
import com.dqzhou.userservice.entity.Member;
import com.dqzhou.userservice.mapper.MemberMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;


@SpringBootTest
class UserServiceApplicationTests {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceApplicationTests.class);

    @Autowired
    private MemberMapper memberMapper;

    @Autowired
    private CommonProperties commonProperties;

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    void testGetProperties() {
        LOGGER.info("redis prefix key is {}", commonProperties.getRedisPrefix());
    }

    @Test
    void testSelect() {
        QueryWrapper<Member> memberQueryWrapper = Wrappers.query();
        memberQueryWrapper.eq("uid", 1000000);
        Member member = memberMapper.selectOne(memberQueryWrapper);
        LOGGER.info("userinfo is [{}]", member.toString());
        Assertions.assertEquals("donnie", member.getNickname());
    }

    @Test
    void testSaveMember() {
        Member member = Member.builder()
                .nickname("donnie")
                .username("fdacxxxxzwa")
                .uid(1000000)
                .password("123456").build();
        int rows = memberMapper.insert(member);
        Assertions.assertEquals(1, rows);
    }

    @Test
    void testRedisConnect() {
        redisTemplate.opsForValue().set("Kobe","Bryant");
        System.out.println(redisTemplate.opsForValue().get("Kobe"));
    }

}
