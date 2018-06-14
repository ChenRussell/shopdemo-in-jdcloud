package com.jd.controller;



import com.jd.domain.User;

import com.jd.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	// find all users
	@RequestMapping(value = "/users", method = RequestMethod.GET)
	public String list(Model model) {
		model.addAttribute("users", userService.findUserList());
		return "user/list";
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String add(Model model) {
		model.addAttribute(new User());
		return "user/add";
	}
	
	// add user
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add(@Validated User user, BindingResult br) {
		if (br.hasErrors()) {
			return "user/add";
		}
		userService.addUser(user);
		return "redirect:/user/users";
	}

	@RequestMapping(value = "/{userid}/update", method = RequestMethod.GET)
	public String update(@PathVariable int userid, Model model) {
		model.addAttribute("user", userService.findById(userid));
		return "user/update";
	}
	
	// update
	@RequestMapping(value = "/{userid}/update", method = RequestMethod.POST)
	public String update(@PathVariable int userid, @Validated User user,
			BindingResult br, Model model) {
		if (br.hasErrors()) {
			return "user/update";
		}
		userService.updateUserById(user.getPassword(), user.getUserid());
		return "redirect:/user/users";
	}

	@RequestMapping(value = "/{userid}/delete", method = RequestMethod.GET)
	public String delete(@PathVariable int userid) {
		userService.deleteById(userid);
		return "redirect:/user/users";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(User user) {
		boolean res = userService.checkLogin(user);
		if (!res) return "/error_login";
		else return "redirect:/user/users";
	}

}
