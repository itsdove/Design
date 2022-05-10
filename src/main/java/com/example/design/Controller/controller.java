package com.example.design.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


public class controller {
    public static void main(String[] args) throws UnsupportedEncodingException {
        List<String> list = readCSV();
        Object[] objects = list.toArray();
    }
    public static List<String> readCSV() {
        List<String>kgInfoList=new ArrayList<>();
        try {
            DataInputStream in = new DataInputStream(new FileInputStream(new File("C:\\Users\\lianx\\Desktop\\documents-export-2022-04-24\\附件3-Data\\第二部分异常（2019.1.1-1.3）.csv")));
            BufferedReader reader = new BufferedReader(new InputStreamReader(in,"UTF-16"));// 文件名
            reader.readLine();//第一行信息，为标题信息，不用,如果需要，注释掉
            String line = null;
            while ((line = reader.readLine()) != null) {
                String item[] = line.split("\t");// CSV格式文件为逗号分隔符文件，这里根据逗号切分

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return kgInfoList;
    }

}
