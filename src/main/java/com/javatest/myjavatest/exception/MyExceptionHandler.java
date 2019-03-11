package com.javatest.myjavatest.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MyExceptionHandler {
	@ExceptionHandler(value = Exception.class)
	public String errorHandler(HttpServletRequest reqest, 
    		HttpServletResponse response, Exception e) throws Exception{
//		e.printStackTrace();
		System.out.println("出错了");
		return "出错了";
	}
}
