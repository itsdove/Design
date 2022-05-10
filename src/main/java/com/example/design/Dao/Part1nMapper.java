package com.example.design.Dao;

import com.example.design.bean.Part1n;
import com.example.design.bean.Part1nExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface Part1nMapper {
    int countByExample(Part1nExample example);

    int deleteByExample(Part1nExample example);

    int insert(Part1n record);

    int insertSelective(Part1n record);

    List<Part1n> selectByExample(Part1nExample example);

    int updateByExampleSelective(@Param("record") Part1n record, @Param("example") Part1nExample example);

    int updateByExample(@Param("record") Part1n record, @Param("example") Part1nExample example);
}