package com.controller;
import com.mapper.OrgMapper;
import com.pojo.Org;
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
public class OrgController {

    @Autowired
    private OrgMapper orgMapper;


    @RequestMapping("sysOrg/search")
    @ResponseBody
    public Result orgSearch() {
        List<Org> orgs = orgMapper.selectTest();
        return Result.okData(parseMenuTree(orgs)) ;
    }


    public static List<Org> parseMenuTree(List<Org> list) {
        List<Org> result = new ArrayList<Org>();
        // 1、获取第一级节点
        for (Org content : list) {
            if ("0".equals(content.getcParentOrgno())) {
                result.add(content);
            }
        }
//         2、递归获取子节点
        for (Org contentVo : result) {
            recursiveMenuTree(contentVo, list);
        }
        return result;
    }

    public static void recursiveMenuTree(Org parent, List<Org> list) {
        for (Org child : list) {
            if (Objects.equals(parent.getcOrgno(), child.getcParentOrgno())) {
                parent.getChildOrg().add(child);
                recursiveMenuTree(child, list);
            }
        }
    }
}
