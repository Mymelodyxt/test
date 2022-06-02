package com.pojo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public class ProbentryField {

    private Long lid;
    private String cDirName;
    private Long lPid;
    private List child = new ArrayList<>();

    public Long getLid() {
        return lid;
    }

    public void setLid(Long lid) {
        this.lid = lid;
    }

    public String getcDirName() {
        return cDirName;
    }

    public void setcDirName(String cDirName) {
        this.cDirName = cDirName;
    }

    public Long getlPid() {
        return lPid;
    }

    public void setlPid(Long lPid) {
        this.lPid = lPid;
    }

    public List getChild() {
        return child;
    }

    public void setChild(List child) {
        this.child = child;
    }
}
