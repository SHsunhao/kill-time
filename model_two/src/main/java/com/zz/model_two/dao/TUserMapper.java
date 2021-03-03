package com.zz.model_two.dao;

import com.zz.model_two.po.TUser;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TUserMapper {

    // int deleteByPrimaryKey(Long userId);

    int insert(TUser record);

    // int insertSelective(TUser record);


    // TUser selectByPrimaryKey(Long userId);


    // int updateByPrimaryKeySelective(TUser record);

    // int updateByPrimaryKey(TUser record);
}