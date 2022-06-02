package com.pojo;

import lombok.Data;

import java.math.BigDecimal;


public class Dictionary {


//    private String c_Sysname;
//    private String l_Keyno;
//    private String c_Keyvalue;
//    private String c_Caption;
//    private String c_Modify;
//    private String c_Memo;
//    private String c_English;
//    private BigDecimal l_Order;


    private String cSysname;

    public String getcSysname() {
        return cSysname;
    }

    public void setcSysname(String cSysname) {
        this.cSysname = cSysname;
    }

    public String getlKeyno() {
        return lKeyno;
    }

    public void setlKeyno(String lKeyno) {
        this.lKeyno = lKeyno;
    }

    public String getcKeyvalue() {
        return cKeyvalue;
    }

    public void setcKeyvalue(String cKeyvalue) {
        this.cKeyvalue = cKeyvalue;
    }

    public String getcCaption() {
        return cCaption;
    }

    public void setcCaption(String cCaption) {
        this.cCaption = cCaption;
    }

    public String getcModify() {
        return cModify;
    }

    public void setcModify(String cModify) {
        this.cModify = cModify;
    }

    public String getcMemo() {
        return cMemo;
    }

    public void setcMemo(String cMemo) {
        this.cMemo = cMemo;
    }

    public String getcEnglish() {
        return cEnglish;
    }

    public void setcEnglish(String cEnglish) {
        this.cEnglish = cEnglish;
    }

    public BigDecimal getlOrder() {
        return lOrder;
    }

    public void setlOrder(BigDecimal lOrder) {
        this.lOrder = lOrder;
    }

    private String lKeyno;
    private String cKeyvalue;
    private String cCaption;
    private String cModify;
    private String cMemo;
    private String cEnglish;
    private BigDecimal lOrder;




}
