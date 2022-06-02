package com.pojo;

import java.util.ArrayList;
import java.util.List;

public class ProbentryVo {

    //主表
    private Long lPid;
    private String cEntryDesc;
    private String cRiskLevel;
    private String cPname;
    private String cDefineBasis;
    private String cDealBasis;
    private Long lId;
    //字典表
//    private Long lid2;
//    private String cDirName;
//    private Long lPid2;
//    private List<ProbentryField> child = new ArrayList<>();
    //
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Long getlPid() {
        return lPid;
    }

    public void setlPid(Long lPid) {
        this.lPid = lPid;
    }

    public String getcEntryDesc() {
        return cEntryDesc;
    }

    public void setcEntryDesc(String cEntryDesc) {
        this.cEntryDesc = cEntryDesc;
    }

    public String getcRiskLevel() {
        return cRiskLevel;
    }

    public void setcRiskLevel(String cRiskLevel) {
        this.cRiskLevel = cRiskLevel;
    }

    public String getcPname() {
        return cPname;
    }

    public void setcPname(String cPname) {
        this.cPname = cPname;
    }

    public String getcDefineBasis() {
        return cDefineBasis;
    }

    public void setcDefineBasis(String cDefineBasis) {
        this.cDefineBasis = cDefineBasis;
    }

    public String getcDealBasis() {
        return cDealBasis;
    }

    public void setcDealBasis(String cDealBasis) {
        this.cDealBasis = cDealBasis;
    }

    public Long getlId() {
        return lId;
    }

    public void setlId(Long lId) {
        this.lId = lId;
    }

//    public Long getLid2() {
//        return lid2;
//    }
//
//    public void setLid2(Long lid2) {
//        this.lid2 = lid2;
//    }
//
//    public String getcDirName() {
//        return cDirName;
//    }
//
//    public void setcDirName(String cDirName) {
//        this.cDirName = cDirName;
//    }
//
//    public Long getlPid2() {
//        return lPid2;
//    }
//
//    public void setlPid2(Long lPid2) {
//        this.lPid2 = lPid2;
//    }
//
//    public List<ProbentryField> getChild() {
//        return child;
//    }
//
//    public void setChild(List<ProbentryField> child) {
//        this.child = child;
//    }
}
