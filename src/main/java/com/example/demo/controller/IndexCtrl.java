package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.model.UserDB;

@Controller
public class IndexCtrl {
	
	@GetMapping({"/","/index"})
	public String getIndex(Model model) {
		WelcomeMsg welcomeMsg = new WelcomeMsg("Welcome Firas", "No pain No gain");
		model.addAttribute("msg", welcomeMsg);
		return "index";
	}
	
	@GetMapping("/show/users")
	public String getShowUsers(Model model) {
		model.addAttribute("listUsers",UserDB.getUsers());
		return "users/show-users";
	}
	
	@GetMapping("/delete/user/{id}")
	public String deleteUser(@PathVariable int id){
		UserDB.remove(id);
		return "redirect:/show/users";
	}
}
