package com.dong.dao;

import com.dong.model.Testuser;

public interface TestuserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Testuser record);

    int insertSelective(Testuser record);

    Testuser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Testuser record);

    int updateByPrimaryKey(Testuser record);
}