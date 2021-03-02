package com.zz.model_two.dao;

import com.zz.model_two.po.TAuthority;
import java.util.List;

public interface TAuthorityMapper {

    int deleteByPrimaryKey(Integer authorityId);

    int insert(TAuthority record);

    int insertSelective(TAuthority record);


    TAuthority selectByPrimaryKey(Integer authorityId);


    int updateByPrimaryKeySelective(TAuthority record);

    int updateByPrimaryKey(TAuthority record);
}