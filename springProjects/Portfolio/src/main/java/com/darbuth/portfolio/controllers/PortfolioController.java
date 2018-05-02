package com.darbuth.portfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PortfolioController {
	@RequestMapping("/")
	public String index() {
		System.out.println("hello");
		return "forward:/index.html";
	}
	@RequestMapping("/about")
	public String about() {
		return "forward:/about.html";
	}
	@RequestMapping("/projects")
	public String projects() {
		return "forward:/projects.html";
	}
}
