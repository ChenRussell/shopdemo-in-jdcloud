package com.jd.controller;


import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jd.domain.Order;
import com.jd.service.OrderService;

@Controller
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	@RequestMapping(value="/{userid}/orders")
	public String list(@PathVariable int userid,Model model, Order order){
		System.out.println("userid"+order.getUserId());
		model.addAttribute("orders", orderService.findOrdersByUserId(order));
		model.addAttribute("searchParam", order);
		model.addAttribute("userid", userid);
		return "order/list";
	}
	
	@RequestMapping(value = "/{userId}/add", method = RequestMethod.GET)
	public String add(@PathVariable int userId, Model model) {
		model.addAttribute(new Order());
		return "order/add";
	}
	
	@RequestMapping(value = "/{userId}/add", method = RequestMethod.POST)
	public String add(@PathVariable int userId, Order order) {
		/*if (br.hasErrors()) {
			return "order/add";
		}*/
		//System.out.println(order.getOrderNum() + "," + order.getTime() + "," + order.getProduct() + "," + order.getRemark() + "," + order.getUserId());
		order.setUserid(userId);
		System.out.println("time:"+order.getTime());
		order.setTime(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()));
		orderService.addOrder(order);
		return "redirect:/order/{userId}/orders";
	}
	
	@RequestMapping(value = "/{userId}/{orderId}/delete", method = RequestMethod.GET)
	public String delete(@PathVariable("userId") int userId,@PathVariable("orderId") int orderId){
		System.out.println(orderId + "," + userId);
		//int userId = o.getUserId();
		orderService.deleteOrderByOrderId(orderId);
		return "redirect:/order/{userId}/orders";
	}
}
