package com.jd.controller;




import javax.annotation.Resource;

import com.jd.service.OrderService;
import com.jd.service.serviceImpl.OrderServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	@RequestMapping(value="/{userid}/orders",method=RequestMethod.GET)
	public String list(@PathVariable int userid,Model model){
		System.out.println("111111111111");
		model.addAttribute("orders", orderService.findOrdersByUserId(userid));
		return "order/list";
	}
	

}
