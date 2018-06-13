package com.jd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jd.exception.CustomException;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@RequestMapping("/test")
	public void test(String name) {
		if(name==null) {
			throw new CustomException("E881","name can not be null!!!");
		}else {
			throw new RuntimeException("a runtime exception!!!");
		}
	}

}
