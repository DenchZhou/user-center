package com.dqzhou.userservice.component;

import com.dqzhou.userservice.entity.Member;
import com.userservice.facade.dto.UserInfoDto;

public interface MemberComponent {

    void addMember(Member member);

    void checkPassword(String username, String password);

    UserInfoDto getMemberByUid(int uid);
}
