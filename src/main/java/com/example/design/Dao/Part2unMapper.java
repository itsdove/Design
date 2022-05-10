package com.example.design.Dao;

import com.example.design.bean.Part2un;
import com.example.design.bean.Part2unExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Part2unMapper {
    int countByExample(Part2unExample example);

    int deleteByExample(Part2unExample example);

    int insert(Part2un record);

    int insertSelective(Part2un record);

    List<Part2un> selectByExample(Part2unExample example);

    int updateByExampleSelective(@Param("record") Part2un record, @Param("example") Part2unExample example);

    int updateByExample(@Param("record") Part2un record, @Param("example") Part2unExample example);
}