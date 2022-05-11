package com.example.design.Controller;

import com.example.design.Dao.MapMapper;
import com.example.design.bean.Map;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MapController {
    @Autowired
    MapMapper mapMapper;

    @RequestMapping(value = "/map")
//    @CrossOrigin(origins = "*",maxAge = 3600)
    public  @ResponseBody
    PageInfo getid(@Param("group")int group, @Param("pageNum")int pageNum, @Param("size")int size) {
        PageHelper.startPage(pageNum, size);
        List<Map> maps = mapMapper.get(group);
        PageInfo pageInfo=new PageInfo(maps);
        System.out.println(pageInfo);
        return pageInfo;
    }

}
