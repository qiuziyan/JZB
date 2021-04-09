package com.qiujie.jzb.model;

import lombok.Data;

@Data
public class Response {
    //返回码
    private String code;
    //返回信息
    private String message;
    //返回实体
    private Object obj;
    public Response(){}
    public Response(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
