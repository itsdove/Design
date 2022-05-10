package com.example.design.Controller;

import com.example.design.Dao.MapMapper;
import com.example.design.bean.Map;
import com.example.design.bean.MapExample;
import org.apache.ibatis.annotations.Mapper;
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

    @RequestMapping(value = "/map",params = "group")
    @CrossOrigin(origins = "*",maxAge = 3600)
    public  @ResponseBody Object[] getid(@Param("group")int group) {
        MapExample mapExample=new MapExample();
        List<Map> maps = mapMapper.get(group);
        return maps.toArray();
    }

}
