package com.darbuth.loginreg.controllers;

import java.security.Principal;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.darbuth.loginreg.models.User;
import com.darbuth.loginreg.services.UserService;
import com.darbuth.loginreg.validator.UserValidator;

@Controller
public class Users {

	private UserService us;
	
	private UserValidator uv;
	
	public Users(UserService us,
			UserValidator uv) {
		this.us = us;
		this.uv = uv;
	}
	
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping("/register")
	public String registerForm(@Valid @ModelAttribute("user") User user) {
		return "register.jsp";
	}
	
	@PostMapping("/register")
	public String registration(@Valid @ModelAttribute("user") User user,
			BindingResult result,
			Model model,
			HttpSession sesh) {
		uv.validate(user, result);
		if (result.hasErrors()) {
			return "register.jsp";
		}
		us.saveWithUserRole(user);
		return "redirect:/login";
	}
	
	@RequestMapping("/login")
	public String login(@RequestParam(value = "error", required = false) String error,
			@RequestParam(value = "logout", required = false) String logout,
			Model model) {
		if (error != null) {
			model.addAttribute("errorMessage", "Invalid credentials, please try again.");
		} if (logout != null) {
			model.addAttribute("logoutMessage", "Logout successsful");
		}
		return "login.jsp";
	}
	
	@RequestMapping("/dashboard")
	public String show(Principal principal,
			Model model) {
		String username = principal.getName();
		model.addAttribute("currentUser", us.findByUsername(username));
		return "show.jsp";
	}
}
