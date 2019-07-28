package com.chii.demo.mapper;

import com.chii.demo.pojo.Info;

public interface InfoMapper {
    int deleteByPrimaryKey(Integer mid);

    int insert(Info record);

    int insertSelective(Info record);

    Info selectByPrimaryKey(Integer mid);

    int updateByPrimaryKeySelective(Info record);

    int updateByPrimaryKey(Info record);
}