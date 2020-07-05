package com.userservice.facade.service;

import com.userservice.facade.dto.UserInfoDto;

/**
 * @Author: ZhouDongqi
 * @Create 2020/7/5 10:04
 **/
public interface IUserService {

    void checkPassword(String username, String password);

    UserInfoDto getUserById(int uid);
}
