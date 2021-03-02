package com.zz.model_two.dao;

import com.zz.model_two.po.TDetails;
import java.util.List;

public interface TDetailsMapper {

    int deleteByPrimaryKey(Long detailsId);

    int insert(TDetails record);

    int insertSelective(TDetails record);

    TDetails selectByPrimaryKey(Long detailsId);

    int updateByPrimaryKeySelective(TDetails record);

    int updateByPrimaryKeyWithBLOBs(TDetails record);

    int updateByPrimaryKey(TDetails record);
}