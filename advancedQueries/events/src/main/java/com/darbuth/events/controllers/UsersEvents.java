package com.darbuth.events.controllers;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.darbuth.events.models.Event;
import com.darbuth.events.models.User;
import com.darbuth.events.services.ApiService;

@Controller
public class UsersEvents {

	@Autowired
	private ApiService as;
	
	@RequestMapping("/events/join/{id}")
	public String joinEvent(@PathVariable("id") Long id,
			Principal principal) {
		User user = as.findByUsername(principal.getName());
		Event event = as.findEventById(id);
		as.createUserEvent(user, event);
		return "redirect:/events";
	}
	
	@RequestMapping("/events/cancel/{id}")
	public String cancelEvent(@PathVariable("id") Long id,
			Principal principal) {
		User user = as.findByUsername(principal.getName());
		Event event = as.findEventById(id);
		as.deleteUserEvent(user, event);
		return "redirect:/events";
	}
}
