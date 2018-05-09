package com.darbuth.license.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.darbuth.license.models.License;
import com.darbuth.license.models.Person;
import com.darbuth.license.services.PersonService;

@Controller
public class Persons {
	
	private final PersonService ps;
	public Persons(PersonService ps) {
		this.ps = ps;
	}
	
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("persons", ps.allPersons());
		return "index.jsp";
	}
	
	@RequestMapping("/persons/new")
	public String newPerson(@ModelAttribute("person") Person person) {
		return "newPerson.jsp";
	}
	
	@PostMapping("/persons/new")
	public String createPerson(@Validated @ModelAttribute("person") Person person,
			BindingResult result) {
		if (result.hasErrors()) {
			return "newPerson.jsp";
		} else {
			ps.addPerson(person);
			return "redirect:/";
		}
	}
}
