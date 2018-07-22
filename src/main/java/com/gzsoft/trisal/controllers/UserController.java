package com.gzsoft.trisal.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
		
	@GetMapping("/login")
	public String login(Model model) {
		return "login-page";
	}
	
	@GetMapping("/register")
	public String register(Model model) {
		return "register";
	}
	
	@GetMapping("/create")
	public String create (Model model) {
		return "/user/create";
	}

}
