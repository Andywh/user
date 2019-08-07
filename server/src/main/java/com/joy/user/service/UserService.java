package com.joy.user.service;

import com.joy.user.dataobject.UserInfo;

public interface UserService {

    /**
     * 通过 openid 来查询用户信息
     * @param openid
     * @return
     */
    UserInfo findByOpenid(String openid);

}
