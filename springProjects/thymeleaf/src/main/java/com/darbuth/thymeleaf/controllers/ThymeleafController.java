package com.darbuth.thymeleaf.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThymeleafController {
	@RequestMapping("/")
	public String index() {
		return "twotwo";
	}
	@RequestMapping("/anotherpage")
	public String anotherpage() {
		return "twofour";
	}
}
