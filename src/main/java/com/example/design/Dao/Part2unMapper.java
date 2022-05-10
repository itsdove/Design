package com.example.design.Dao;

import com.example.design.bean.Part2un;
import com.example.design.bean.Part2unExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;

@Mapper
public interface Part2unMapper {
    int countByExample(Part2unExample example);

    int insert(Part2un record);

    int insertSelective(Part2un record);

    List<Part2un> selectByExample(Part2unExample example);

    List<String> get(@Param("id") String id);

    List<String> getdate();


}