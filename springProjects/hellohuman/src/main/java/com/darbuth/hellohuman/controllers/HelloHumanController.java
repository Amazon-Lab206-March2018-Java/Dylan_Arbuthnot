package com.darbuth.hellohuman.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloHumanController {
	@RequestMapping("/")
	public String index(@RequestParam(value="name", defaultValue="Human") String name, @RequestParam(value="last_name", required=false) String last_name, Model model) {
		model.addAttribute("name", name);
		if (last_name != "") {
			model.addAttribute("last_name", last_name);
			System.out.println(last_name);
		}
		return "index.jsp";
	}
}
