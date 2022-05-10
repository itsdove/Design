package com.example.design.Dao;

import com.example.design.bean.Part3n;
import com.example.design.bean.Part3nExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface Part3nMapper {
    int countByExample(Part3nExample example);

    int insert(Part3n record);

    int insertSelective(Part3n record);

    List<Part3n> selectByExample(Part3nExample example);

    List<String> get(@Param("id") String id);

    List<String> getdate();
}