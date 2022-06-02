package com.controller;

import com.mapper.ProbentryFieldMapper;
import com.pojo.Org;
import com.pojo.ProbentryField;
import com.pojo.ProbentryVo;
import com.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
@CrossOrigin
@Controller
public class ProbentryFieldController {

    @Autowired
    private ProbentryFieldMapper probentryFieldMapper;

    @RequestMapping("aaa")
    @ResponseBody
    public List<ProbentryVo> get(){

        List<ProbentryVo> all = probentryFieldMapper.getAll();



        return null;
    }


    @RequestMapping("ormProbentryField/ormProbenttryFieldTree")
    @ResponseBody
    public Result getTree() {
        List<ProbentryField> treeField = probentryFieldMapper.getTreeField();

        List<ProbentryField> list = new ArrayList<>();

        List<ProbentryVo> all = probentryFieldMapper.getAll();
        for (ProbentryField pf : treeField) {
            if (0.0==(pf.getlPid())) {
                list.add(pf);
            }
        }
        for (ProbentryField pro : list) {
            getTree(treeField,pro,all);
        }

        return Result.okData(list);
    }


    public void getTree(List<ProbentryField> alllist,ProbentryField parent,List<ProbentryVo> all){

        for (ProbentryField child : alllist) {
            if (parent.getLid().equals(child.getlPid())) {
                parent.getChild().add(child);
                getTree(alllist,child,all);
            }
            for(ProbentryVo pro :all){
                if(pro.getlPid().equals(child.getLid())){
                    child.getChild().add(pro);
                }
            }
        }
    }

}
