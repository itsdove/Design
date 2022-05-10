package com.example.design.Controller;
import com.example.design.Dao.Part1nMapper;
import com.example.design.Dao.Part2unMapper;
import com.example.design.Dao.Part3nMapper;
import com.example.design.bean.Part1n;
import com.example.design.bean.Part2un;
import com.example.design.bean.Part2unExample;
import com.example.design.bean.Part3n;
import org.apache.coyote.Response;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

@Controller
public class controller {
    @Autowired
    Part2unMapper part2unMapper ;
    @Autowired
    Part1nMapper part1nMapper;
    @Autowired
    Part3nMapper part3nMapper;

   @RequestMapping(value = "/getdig",params = "id")
   @CrossOrigin(origins = "*",maxAge = 3600)
    public  @ResponseBody Object[] getid(@Param("id")String id) {
       List<String> part2uns = part2unMapper.get(id);
       return part2uns.toArray();
    }

    @RequestMapping("/date")
    @CrossOrigin(origins = "*",maxAge = 3600)
    public  @ResponseBody Object[] getdate() {
        List<String> part2uns = part2unMapper.getdate();
        return part2uns.toArray();
    }


}
