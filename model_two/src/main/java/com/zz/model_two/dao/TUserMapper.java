package com.zz.model_two.dao;

import com.zz.model_two.po.TUser;
import java.util.List;

public interface TUserMapper {

    int deleteByPrimaryKey(Long userId);

    int insert(TUser record);

    int insertSelective(TUser record);

    TUser selectByPrimaryKey(Long userId);

    int updateByPrimaryKeySelective(TUser record);

    int updateByPrimaryKey(TUser record);
}