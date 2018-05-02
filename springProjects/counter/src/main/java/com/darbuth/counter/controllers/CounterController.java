package com.darbuth.counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CounterController {
	@RequestMapping("/")
	public String index(HttpSession session) {
		if (session.isNew()) {
			session.setAttribute("counter", 0);
		} else {
			Integer count = (Integer) session.getAttribute("counter");
			session.setAttribute("counter", count + 1);
		}
		return "index.jsp";
	}
	@RequestMapping("/counter")
	public String counter(HttpSession session) {
		if (session.isNew()) {
			session.setAttribute("counter", 0);
		}
		return "counter.jsp";
	}
	@RequestMapping("/two")
	public String two(HttpSession session) {
		if (session.isNew()) {
			session.setAttribute("counter", 0);
		}
		Integer count = (Integer) session.getAttribute("counter");
		session.setAttribute("counter", count + 2);
		return "two.jsp";
	}
	@RequestMapping("/reset")
	public String reset(HttpSession session) {
		session.setAttribute("counter", 0);
		return "redirect:/counter";
	}
}
