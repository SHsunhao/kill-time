package com.zz.model_two.service.impl;

import com.zz.model_two.dao.TUserMapper;
import com.zz.model_two.po.TUser;
import com.zz.model_two.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author sunhao
 * @date 2021/3/2 19:36
 */
@Service
public class UserLoginServiceImpl implements UserLoginService {

    @Autowired
    private TUserMapper tUserMapper;

    @Override
    public Integer addUser(TUser tUser) {
        int insert = tUserMapper.insert(tUser);
        return insert;
    }
}
