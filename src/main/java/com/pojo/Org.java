package com.pojo;


import lombok.Data;

import java.util.ArrayList;
import java.util.List;

//@Data
public class Org {

    private String cOrgno;
    private String cParentOrgno;
    private String cOrgName;
    private List<Org> childOrg = new ArrayList<>();

    public String getcOrgno() {
        return cOrgno;
    }

    public void setcOrgno(String cOrgno) {
        this.cOrgno = cOrgno;
    }

    public String getcParentOrgno() {
        return cParentOrgno;
    }

    public void setcParentOrgno(String cParentOrgno) {
        this.cParentOrgno = cParentOrgno;
    }

    public String getcOrgName() {
        return cOrgName;
    }

    public void setcOrgName(String cOrgName) {
        this.cOrgName = cOrgName;
    }

    public List<Org> getChildOrg() {
        return childOrg;
    }

    public void setChildOrg(List<Org> childOrg) {
        this.childOrg = childOrg;
    }
}
