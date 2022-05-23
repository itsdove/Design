package com.example.design.Controller;
import com.example.design.Dao.Part1nMapper;
import com.example.design.Dao.Part2unMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;
@Controller
public class controller {
    @Autowired
    Part2unMapper part2unMapper ;
    @Autowired
    Part1nMapper part1nMapper;

   @RequestMapping(value = "/getdig")
//   @CrossOrigin(origins = "*",maxAge = 3600)
    public  @ResponseBody
   Object[][] getid(@RequestParam("id")String id, @RequestParam("part") String group) {
       Object[][] object=new Object[2][];
       List<String> part2uns;
       if(group.equals("1"))
            part2uns = part1nMapper.get(id);
       else
            part2uns = part2unMapper.get(id);
       List<String> date = part2unMapper.getdate();
       object[0]=part2uns.toArray();
       object[1]=date.toArray();
       return object;
    }

}
