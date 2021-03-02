package com.zz.model_two.dao;

import com.zz.model_two.po.TUserAuthority;
import java.util.List;

public interface TUserAuthorityMapper {

    int deleteByPrimaryKey(Integer userAuthorityId);

    int insert(TUserAuthority record);

    int insertSelective(TUserAuthority record);


    TUserAuthority selectByPrimaryKey(Integer userAuthorityId);


    int updateByPrimaryKeySelective(TUserAuthority record);

    int updateByPrimaryKey(TUserAuthority record);
}