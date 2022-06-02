package com.controller;


import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.mapper.DictionaryMapper;
import com.mapper.InfoMapper;
import com.pojo.Dictionary;
import com.pojo.Info;
import com.pojo.Records;
import com.util.Result;
import org.apache.poi.hpsf.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
@CrossOrigin
@Controller
public class InfoController {
    @Autowired
    private InfoMapper infoMapper;

    @RequestMapping("ormWarnInfo/search")
    @ResponseBody
    public Result selectList(@RequestBody Map map) {
        System.out.println(map+"--------------------");
        Integer currentPage = (Integer) map.get("currentPage");
        Integer pageSize = (Integer) map.get("pageSize");
        currentPage = (currentPage - 1) * pageSize;
        map.put("currentPage", currentPage);
        System.out.println(map);
        List<Info> infos = infoMapper.selectTest(map);
        Records records = new Records();
        records.setRecords(infos);
        return Result.okData(records);
    }


    @RequestMapping("ormWarnInfo/exportExcel")
    public void select(@RequestBody Map map,HttpServletResponse response) throws IOException {
        System.out.println("--------");
        List<Info> infos = infoMapper.selectExport(map);
        data(infos,response,map);
    }

    private void data( List<Info> infos,HttpServletResponse response,Map map) throws IOException {
        List<Info> list = new ArrayList<Info>();
        for (int i = 0; i < infos.size(); i++) {
            Info data = new Info();
            data.setlId(infos.get(i).getlId());
            data.setcWarnno(infos.get(i).getcWarnno());
            data.setcWarnname(infos.get(i).getcWarnname());
//            data.setC_Warnlevel(infos.get(i).getC_Warnlevel());
//            data.setC_Warnlevel(infos.get(i).getC_Warnlevel());
//            data.setC_Warnlevel(infos.get(i).getC_Warnlevel());
            list.add(data);
        }
       download(response,list,map);
    }

//    public void simpleWrite(List list) {
//        // 写法1
//        String fileName = "C:\\Users\\11459\\IdeaProjects\\untitled\\" + "o.xlsx";
//        // 这里 需要指定写用哪个class去写，然后写到第一个sheet，名字为模板 然后文件流会自动关闭
//        // 如果这里想使用03 则 传入excelType参数即可
//        EasyExcel.write(fileName, Info.class).sheet("模板").doWrite(list);
//        // 写法2
//        fileName = TestFileUtil.getPath() + "simpleWrite" + System.currentTimeMillis() + ".xlsx";
//        // 这里 需要指定写用哪个class去写
//        ExcelWriter excelWriter = EasyExcel.write(fileName, DemoData.class).build();
//        WriteSheet writeSheet = EasyExcel.writerSheet("模板").build();
//        excelWriter.write(data(), writeSheet);
//        // 千万别忘记finish 会帮忙关闭流
//        excelWriter.finish();
//    }

    public void download(HttpServletResponse response,List list,Map map) throws IOException {
        // 这里注意 有同学反应使用swagger 会导致各种问题，请直接用浏览器或者用postman
        response.setContentType("application/vnd.ms-excel");
        response.setCharacterEncoding("utf-8");
//        // 这里URLEncoder.encode可以防止中文乱码 当然和easyexcel没有关系
//        String fileName = URLEncoder.encode((String) map.get("fileName"), "UTF-8");
//        response.setHeader("Content-disposition", fileName + ".xlsx");
//
//        EasyExcel.write(response.getOutputStream(),Info.class).sheet((String) map.get( "sheetName")).doWrite(list);

       String  fileName = "D://"+ (String) map.get("fileName") + ".xlsx";
        // 这里 需要指定写用哪个class去写
        ExcelWriter excelWriter = EasyExcel.write(response.getOutputStream(), Info.class).build();
        WriteSheet writeSheet = EasyExcel.writerSheet((String) map.get( "sheetName")).build();
        excelWriter.write(list, writeSheet);
        // 千万别忘记finish 会帮忙关闭流
        excelWriter.finish();
    }


}
