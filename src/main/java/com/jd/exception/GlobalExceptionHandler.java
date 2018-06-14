package com.jd.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(CustomException.class)
	public ModelAndView customGenericExceptionHandler(CustomException exception) {
		ModelAndView modelAndView = new ModelAndView("/error");
		modelAndView.addObject("errCode",exception.getErrCode());
		modelAndView.addObject("errMsg",exception.getErrMsg());
		return modelAndView;
	}
	
	@ExceptionHandler(Exception.class)
	public ModelAndView allExceptionHandler(Exception exception) {
		ModelAndView modelAndView = new ModelAndView("/error");
		modelAndView.addObject("errMsg",exception.getMessage());
		return modelAndView;
	}
		
		
}
