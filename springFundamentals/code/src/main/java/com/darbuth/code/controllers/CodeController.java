package com.darbuth.code.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CodeController {
	
	@RequestMapping(path = "/", method = RequestMethod.GET)
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping(path = "/", method = RequestMethod.POST)
	public String index(@RequestParam(value="code") String code,
			@ModelAttribute("errors") String errors,
			Model model,
			HttpSession session) {
		model.addAttribute("code", code);
		if (model.asMap().containsValue("bushido")) {
			session.setAttribute("enter", true);
			return "redirect:/code";
		}
		session.setAttribute("enter", false);
		return "redirect:/errors";
	}
	
	@RequestMapping("/errors")
	public String error(RedirectAttributes redirectAttributes) {
		redirectAttributes.addFlashAttribute("error", "You must train harder!");
        return "redirect:/";
		
	}
	
	@RequestMapping("/code")
	public String code(HttpSession session) {
		if ((Boolean) session.getAttribute("enter")) {
			return "code.jsp";
		}
		return "redirect:/";
	}
}
