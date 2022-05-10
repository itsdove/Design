package com.example.design.Controller;
import com.example.design.Dao.Part2unMapper;
import com.example.design.bean.Part2un;
import com.example.design.bean.Part2unExample;
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

    @Autowired
    Part2unMapper part2unMapper ;
    public @ResponseBody String get() {
        try {
            DataInputStream in = new DataInputStream(new FileInputStream("C:\\Users\\lianx\\Desktop\\documents-export-2022-04-24\\附件3-Data\\第二部分正常（2019.5.1-5.3）.csv"));
            BufferedReader reader = new BufferedReader(new InputStreamReader(in,"UTF-16"));// 文件名
            reader.readLine();//第一行信息，为标题信息，不用,如果需要，注释掉
            String line = null;
            while ((line = reader.readLine()) != null) {
                String item[] = line.split("\t");// CSV格式文件为逗号分隔符文件，这里根据逗号切分
                Part2un part2un=new Part2un(item[0],item[1],item[2],item[3],item[4],item[5],item[6],item[7],item[8],item[9],item[10],item[11],item[12],item[13]);
                part2unMapper.insert(part2un);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return  "a";

    }
}
