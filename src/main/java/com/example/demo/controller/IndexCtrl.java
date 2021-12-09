package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.User;
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
	
	@GetMapping("/add/user")
	public String addUser(Model model) {
		model.addAttribute("user", new User());
		return "users/add-user";
	}
	
	@PostMapping("/add/user")
	public String postAddUser(@ModelAttribute("User") User user) {
		UserDB.add(user);
		return "redirect:/show/users";
	}
	
	@GetMapping("/update/user/{id}")
	public String updateUser(@PathVariable int id,Model model){
		model.addAttribute("user", UserDB.get(id));
		return "users/add-user";
	}
	
	
}
