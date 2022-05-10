package com.example.design.Dao;

import com.example.design.bean.Part3n;
import com.example.design.bean.Part3nExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface Part3nMapper {
    int countByExample(Part3nExample example);

    int deleteByExample(Part3nExample example);

    int insert(Part3n record);

    int insertSelective(Part3n record);

    List<Part3n> selectByExample(Part3nExample example);

    int updateByExampleSelective(@Param("record") Part3n record, @Param("example") Part3nExample example);

    int updateByExample(@Param("record") Part3n record, @Param("example") Part3nExample example);
}