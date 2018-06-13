package com.jd.controller;

<<<<<<< HEAD
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
=======
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
>>>>>>> 2d95b5c5f2f328b3f83c4775c35832c4a143d243

import com.jd.domain.User;

@Controller
@RequestMapping("/user")
public class UserController {
	
	private Map<String,User> users= new HashMap<String,User>();
	
	public UserController(){
		super();
		users.put("1", new User(1,"liudongdai","123"));
		users.put("2", new User(2,"fangshuyun","123"));
		users.put("3", new User(3,"zhonghanhui","123"));
		users.put("4", new User(4,"chenrui","123"));
	}
	
	@RequestMapping(value="/users",method=RequestMethod.GET)
	public String list(Model model){
		model.addAttribute("users",users);
		return "user/list";
	}
	
	@RequestMapping(value="/add",method=RequestMethod.GET)
	public String add(Model model){
		model.addAttribute(new User());
		return "user/add";
	}
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String add(@Validated User user,BindingResult br){
		if(br.hasErrors()){
			return "user/add";
		}
		users.put(user.getUsername(), user);
		return "redirect:/user/users";
	}
	
	@RequestMapping(value="/{id}/update",method=RequestMethod.GET)
	public String update(@PathVariable int id, Model model){
		String uid = String.valueOf(id);
		model.addAttribute(users.get(uid));
		return "user/update";
	}
	
	@RequestMapping(value="/{id}/update",method=RequestMethod.POST)
	public String update(@PathVariable int id, @Validated User user,BindingResult br){
		if(br.hasErrors()){
			return "user/update";
		}
		String uid = String.valueOf(user.getId());
		users.put(uid, user);
		return "redirect:/user/users";
	}
	
	@RequestMapping(value="/{id}/delete",method=RequestMethod.GET)
	public String delete(@PathVariable int id){
		String uid = String.valueOf(id);
		users.remove(uid);
		return "redirect:/user/users";
	}
	
	
	
}
