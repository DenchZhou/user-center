package com.dqzhou.usersdk.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * @Description:
 * @Author: DonnieZhou
 * @Mail: dqzhou5180@foxmail.com
 * @Create 2020-06-01 12:06
 **/
@Aspect
@Component
public class LogAspect {

    private static final Logger LOGGER = LoggerFactory.getLogger(LogAspect.class);

    // 定义命名的切点
    @Pointcut("execution(* com.dqzhou.usersdk.controller..*(..))")
    public void logRecord() {}

    @Around("logRecord()")
    public void watchMessage(ProceedingJoinPoint joinPoint) {
        try {
            System.out.println("request send at " + LocalDateTime.now());
            Object result = joinPoint.proceed();
            LOGGER.info("result is {}", result);
            System.out.println("response send at " + LocalDateTime.now());
        } catch (Throwable throwable) {
            System.out.println("fail to send message at " + LocalDateTime.now());
        }
    }
}
