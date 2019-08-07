package com.joy.user.service.impl;

import com.joy.user.dataobject.UserInfo;
import com.joy.user.repository.UserInfoRepository;
import com.joy.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserInfoRepository repository;

    /**
     * 通过 openid 来查询用户信息
     * @param openid
     * @return
     */
    @Override
    public UserInfo findByOpenid(String openid) {
        return repository.findByOpenid(openid);
    }

}
