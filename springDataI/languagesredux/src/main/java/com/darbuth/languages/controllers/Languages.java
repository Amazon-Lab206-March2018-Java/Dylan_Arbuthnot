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
	
	public List<Language> langList() {
		return languageService.allLanguages();
	}
	
	@RequestMapping("/languages")
	public String languages(@ModelAttribute("language") Language language,
			Model model) {
		List<Language> languages = langList();
		model.addAttribute("languages", languages);
		return "index.jsp";
	}
	
	@PostMapping("/languages")
	public String createLanguage(@Valid @ModelAttribute("language") Language lang,
			BindingResult result,
			Model model) {
		List<Language> languages = langList();
		model.addAttribute("languages", languages);
		if (result.hasErrors()) {
			return "index.jsp";
		} else {
			languageService.addLanguage(lang);
			return "redirect:/languages";
		}
	}
	
	@RequestMapping("/languages/{id}")
	public String showLanguage(@PathVariable("id") Long id,
			Model model) {
		Language lang = languageService.findLanguageById(id);
		model.addAttribute("lang", lang);
		return "showLang.jsp";
	}
	
	@RequestMapping("languages/edit/{id}")
	public String editLanguage(@PathVariable("id") Long id,
			Model model) {
		Language lang = languageService.findLanguageById(id);
		if (lang != null) {
			System.out.print(lang.getId());
			model.addAttribute("language", lang);
			return "updateLang.jsp";
		}
		return "redirect:/languages";
	}
	
	@PostMapping("languages/edit/{id}")
	public String updateLanguage(@Valid @ModelAttribute("language") Language lang,
			BindingResult result,
			@PathVariable("id") Long id) {
		System.out.println(lang.getName());
		if (result.hasErrors()) {
			return "updateLang.jsp";
		} else {
			System.out.println(lang.getCurrentVersion());
			languageService.updateLanguage(lang);
			return "redirect:/languages/{id}";
		}
	}
	
	@RequestMapping("languages/delete/{id}")
	public String destroyLanguage(@PathVariable("id") Long id) {
		languageService.destroyLanguage(id);
		return "redirect:/languages";
	}
}
