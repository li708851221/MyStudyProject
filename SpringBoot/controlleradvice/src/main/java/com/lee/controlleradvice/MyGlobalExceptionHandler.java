package com.lee.controlleradvice;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.multipart.MaxUploadSizeExceededException;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author cvLee
 * @Description //TODO
 * @Date 2019-09-29 10:58
 **/
@ControllerAdvice
public class MyGlobalExceptionHandler {
    //全局异常处理 1.异常页面
//    @ExceptionHandler(Exception.class)
//    public ModelAndView customException(Exception e) {
//        ModelAndView mv = new ModelAndView();
//        mv.addObject("message","超出1KB的上传大小设置");
//        mv.setViewName("myerror");
//        return mv;
//    }
    //全局异常处理 2.返回流
    @ExceptionHandler(MaxUploadSizeExceededException.class)
    public void maxUploadSizeExceededException(MaxUploadSizeExceededException e, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out = resp.getWriter();
        out.write("超出1KB的上传大小设置");
        out.flush();
        out.close();
    }

    //全局数据绑定
    @ModelAttribute(name = "md")
    public Map<String, Object> mydata() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("age", 99);
        map.put("gender", "男");
        return map;
    }



}