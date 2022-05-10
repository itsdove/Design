package com.example.design.Dao;

import com.example.design.bean.Part1n;
import com.example.design.bean.Part1nExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface Part1nMapper {
    int countByExample(Part1nExample example);

    int insert(Part1n record);

    int insertSelective(Part1n record);

    List<Part1n> selectByExample(Part1nExample example);

    List<String> get(@Param("id") String id);

    List<String> getdate();
}