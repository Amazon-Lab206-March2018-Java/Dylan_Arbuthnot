package com.darbuth.languages.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.darbuth.languages.models.Language;
import com.darbuth.languages.services.LanguageService;

@Controller
public class Languages {

	private final LanguageService languageService;
	public Languages(LanguageService languageService) {
		this.languageService = languageService;
	}
	
	@RequestMapping("/languages")
	public String languages(@ModelAttribute("language") Language language,
			Model model) {
		List<Language> languages = languageService.allLanguges();
		model.addAttribute("languages", languages);
		return "index.jsp";
	}
	@PostMapping("/languages")
	public String createLanguage(@Valid @ModelAttribute("language") Language lang,
			BindingResult result,
			Model model) {
		List<Language> languages = languageService.allLanguges();
		model.addAttribute("languages", languages);
		if (result.hasErrors()) {
			return "index.jsp";
		} else {
			languageService.addLanguage(lang);
			return "redirect:/languages";
		}
	}
	@RequestMapping("/languages/{id}")
	public String showLanguage(@PathVariable("id") int index,
			Model model) {
		Language lang = languageService.findLanguage(index);
		model.addAttribute("lang", lang);
		return "showLang.jsp";
	}
	@RequestMapping("languages/edit/{id}")
	public String editLanguage(@ModelAttribute("language") Language language,
			@PathVariable("id") int index,
			Model model) {
		Language lang = languageService.findLanguage(index);
		model.addAttribute("lang", lang);
		return "updateLang.jsp";
	}
	@PostMapping("languages/edit/{id}")
	public String updateLanguage(@PathVariable("id") int id,
			@Valid @ModelAttribute("language") Language lang,
			BindingResult result,
			Model model) {
		if (result.hasErrors()) {
			return "updateLang.jsp";
		} else {
			languageService.updateLanguage(id, lang);
			return "redirect:/languages/{id}";
		}
	}
	@RequestMapping("languages/delete/{id}")
	public String destroyLanguage(@PathVariable("id") int id) {
		languageService.destroyLanguage(id);
		return "redirect:/languages";
	}
}
