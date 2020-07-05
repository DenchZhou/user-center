package com.userservice.facade.dto;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * @Description:
 * @Author: DonnieZhou
 * @Mail: dqzhou5180@foxmail.com
 * @Create 2020-04-11 21:57
 **/
@Data
@Builder
@ToString
public class UserInfoDto implements Serializable {

    private String username;

    private int uid;

    private String nickname;

    private String avatar;

}
