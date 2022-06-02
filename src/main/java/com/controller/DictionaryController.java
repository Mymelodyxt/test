package com.controller;

import com.mapper.DictionaryMapper;
import com.pojo.Dictionary;
import com.pojo.DictionaryDto;
import com.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@CrossOrigin
@Controller
public class DictionaryController {

   @Autowired
    private DictionaryMapper dictionaryMapper;

   @RequestMapping("sysDictionary/search")
   @ResponseBody
    public Result selectList(@RequestBody Map map){
//       List ll = new ArrayList();
//       List type =(List) map.get("type");
//       HashMap o = null;
//       System.out.println(type.size());
//       for (int i = 0; i < type.size(); i++) {
//           o =   (HashMap) type.get(i);
//           System.out.println(o);
//           ll.add(dictionaryMapper.selectList(o));

//       }




       return Result.okData(map);
   }


}
