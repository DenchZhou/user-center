package com.dqzhou.userservice.service.impl;

import com.dqzhou.userservice.component.MemberComponent;
import com.userservice.facade.dto.UserInfoDto;
import com.userservice.facade.service.IUserService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: DonnieZhou
 * @Mail: dqzhou5180@foxmail.com
 * @Create 2020-04-11 21:54
 **/
@Component
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private MemberComponent memberComponent;

    public void checkPassword(String username, String password) {
        memberComponent.checkPassword(username, password);
    }

    public UserInfoDto getUserById(int uid) {
        return memberComponent.getMemberByUid(uid);
    }
}
