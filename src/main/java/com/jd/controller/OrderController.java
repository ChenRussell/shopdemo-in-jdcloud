package com.jd.controller;


import com.jd.domain.Order;
import com.jd.domain.User;
import com.jd.service.OrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	@RequestMapping(value="/{userid}/orders",method=RequestMethod.GET)
	public String list(@PathVariable int userid,Model model){
		model.addAttribute("orders", orderService.findOrdersByUserId(userid));
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
