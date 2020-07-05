package com.dqzhou.usersdk.controller;

import com.dqzhou.usersdk.form.LoginForm;
import com.userservice.facade.dto.UserInfoDto;
import com.userservice.facade.service.IUserService;
import org.apache.dubbo.config.annotation.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description:
 * @Author: DonnieZhou
 * @Mail: dqzhou5180@foxmail.com
 * @Create 2020-04-11 19:33
 **/
@Controller
public class LoginController {

    private final Logger logger = LoggerFactory.getLogger(LoginController.class);

    @Reference
    private IUserService userService;

    @RequestMapping("/login")
    @ResponseBody
    public String login(LoginForm form) {
        UserInfoDto userInfo = userService.getUserById(1000000);
        logger.info("user {} login", userInfo);
        return "success";
    }

}
