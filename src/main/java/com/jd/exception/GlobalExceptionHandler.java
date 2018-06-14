package com.jd.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(CustomException.class)
	public ModelAndView customGenericExceptionHandler(CustomException exception) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("forward:/error.jsp");
		modelAndView.addObject("errCode",exception.getErrCode());
		modelAndView.addObject("errMsg",exception.getErrMsg());
		return modelAndView;
	}
	
	@ExceptionHandler(Exception.class)
	public ModelAndView allExceptionHandler(Exception exception) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("forward:/error.jsp");
		String errMsg = exception.getMessage()+"\n";
		StackTraceElement[] stack= exception.getStackTrace();
		for(StackTraceElement s:stack) {
			errMsg += s+"\n";
		}
		System.out.println(errMsg);
		modelAndView.addObject("errMsg",errMsg);
		return modelAndView;
	}		
}
