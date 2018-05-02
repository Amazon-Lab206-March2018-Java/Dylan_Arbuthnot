package com.darbuth.displaydate.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DisplayDateController {
	@RequestMapping("/")
	public String index(Model model, HttpSession session) {
		return "index.jsp";
	}
	@RequestMapping("/date")
	public String date(Model model) {
		String d = new SimpleDateFormat("EEEE, 'the' d 'of' MMMM, YYYY").format(new Date());
		model.addAttribute("date", d);
		//Sunday, the 21 of May, 2017
		return "date.jsp";
	}
	@RequestMapping("/time")
	public String time(Model model) {
		String t = new SimpleDateFormat("h:m a").format(new Date());
		model.addAttribute("time", t);
		//11:30 PM
		return "time.jsp";
	}
}