package com.chii.demo.mapper;

import com.chii.demo.pojo.Infos;

public interface InfosMapper {
    int deleteByPrimaryKey(Integer iid);

    int insert(Infos record);

    int insertSelective(Infos record);

    Infos selectByPrimaryKey(Integer iid);

    int updateByPrimaryKeySelective(Infos record);

    int updateByPrimaryKey(Infos record);
}