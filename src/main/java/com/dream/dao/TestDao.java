package com.dream.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface TestDao {
    int getCount(@Param("id")String id);
}
