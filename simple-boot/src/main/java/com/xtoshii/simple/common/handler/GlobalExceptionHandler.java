package com.xtoshii.simple.common.handler;

import com.xtoshii.simple.api.response.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {


    @ResponseBody
    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public Response handler(MethodArgumentNotValidException ex, HttpServletRequest request) {
        log.error("请求方法：{}", request.getRequestURI());
        log.error("参数校验错误{}", ex.toString());
        return Response.INVALID_INPUT;
    }

    @ResponseBody
    @ExceptionHandler(value = IllegalArgumentException.class)
    public Response handler(IllegalArgumentException ex, HttpServletRequest request) {
        log.error("请求方法：{}", request.getRequestURI());
        log.error("传参错误{}", ex.toString());
        return Response.INVALID_INPUT;
    }


    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public Response handler(Exception e, HttpServletRequest request) {
        log.error("请求方法：{}", request.getRequestURI());
        log.error("运行时异常：----------------{}---------", e.toString());
        return Response.SYSTEM_ERROR;
    }

}
