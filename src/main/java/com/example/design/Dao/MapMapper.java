package com.example.design.Dao;

import com.example.design.bean.Map;
import com.example.design.bean.MapExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface MapMapper {
    int countByExample(MapExample example);

    int deleteByExample(MapExample example);

    int insert(Map record);

    int insertSelective(Map record);

    List<Map> selectByExample(MapExample example);
    List<Map> get(@Param("group") Integer group);

}