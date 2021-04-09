package com.qiujie.jzb.conf;

import com.qiujie.jzb.exception.MyException;
import com.qiujie.jzb.model.Response;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalExceptionHandler {
    /**
     * 处理自定义的业务异常
     * @param req
     * @param e
     * @return
     */
    @ExceptionHandler(value = MyException.class)
    @ResponseBody
    public Response bizExceptionHandler(HttpServletRequest req,MyException e){

        return new Response("-1",e.getErrorMsg());
    }



    /**
     * 处理其他异常
     * @param req
     * @param e
     * @return
     */
    @ExceptionHandler(value =Exception.class)
    @ResponseBody
    public Response  exceptionHandler(HttpServletRequest req, Exception e){
        return new Response("-1",e.getMessage());
    }
}
