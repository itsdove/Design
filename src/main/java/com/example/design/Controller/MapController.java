package com.example.design.Controller;

import com.example.design.Dao.MapMapper;
import com.example.design.bean.Map;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MapController {
    @Autowired
    MapMapper mapMapper;

    @GetMapping("/map")
//    @CrossOrigin(origins = "*",maxAge = 3600)
    public PageInfo getId(@Param("group") int group, @Param("pageNum") int pageNum, @Param("size") int size) {
        PageHelper.startPage(pageNum, size);
        List<Map> maps = mapMapper.get(group);
        if (maps.size() == 0)
            return new PageInfo();
        PageInfo pageInfo = new PageInfo(maps);
        return pageInfo;
    }

}
