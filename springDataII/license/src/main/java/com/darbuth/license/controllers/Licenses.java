package com.darbuth.license.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.darbuth.license.models.License;
import com.darbuth.license.services.LicenseService;
import com.darbuth.license.services.PersonService;

@Controller
public class Licenses {
	
	@Autowired
	private final LicenseService ls;
	
	@Autowired
	private final PersonService ps;
	
	public Licenses(LicenseService ls, PersonService ps) {
		this.ls = ls;
		this.ps = ps;
	}
	
	@RequestMapping("/licenses/new")
	public String newLicense(@ModelAttribute("license") License license,
			Model model) {
		model.addAttribute("persons", ps.allPersons());
		model.addAttribute("ln", String.format("%06d", 1 + ls.allLicenses().size()));
		return "newLicense.jsp";
	}
	
	@PostMapping("/licenses/new")
	public String createLicense(@Valid @ModelAttribute("license") License license,
			BindingResult result,
			Model model) {
		if (result.hasErrors()) {
			model.addAttribute("persons", ps.allPersons());
			return "newLicense.jsp";
		}
		System.out.println(license.getNumber());
		ls.addLicense(license);
		return "redirect:/";
	}
}
