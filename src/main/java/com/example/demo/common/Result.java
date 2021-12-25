package com.example.demo.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 定义通用的返回数据
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result implements Serializable {
    private String code;//状态码 0为成功其他均为失败
    private Object object;//数据
    private String msg;//返回描述

    public static Result success(Object o,String msg){
        return new Result("0",o,msg);
    }
    public static Result success(Object o){
        return new Result("0",o,"");
    }
    public static Result success(String msg){
        return new Result("0",null,msg);
    }

    public static Result fail(Object o,String msg){
        return new Result("-1",o,msg);
    }
    public static Result fail(Object o){
        return new Result("-1",o,"");
    }
    public static Result fail(String msg){
        return new Result("-1",null,msg);
    }
}
