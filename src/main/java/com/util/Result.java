package com.util;

import lombok.Data;

@Data
public  class  Result {

    private Integer code;
    private String msg;
    private Object data;

    public Result(Integer code,String msg,Object data){
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
    public Result(Integer code,String msg){
        this.code = code;
        this.msg = msg;
    }

    public static Result okData(Object obj){
        return new Result(200,"成功",obj);
    }

    public static Result failData(){
        return new Result(400,"失败");
    }
}
