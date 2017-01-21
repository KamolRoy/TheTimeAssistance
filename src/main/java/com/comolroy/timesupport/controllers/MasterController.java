package com.comolroy.timesupport.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MasterController {
	
	@Value("${app.name}")
	public String appName;
	
	@RequestMapping("/home")
	public String showHome(){
		return "home";
	}
	@RequestMapping("/signup")
	public String showSignUp(Model model){
		model.addAttribute("name", "Kamol");
		return "signup";
	}
	
	
}

