package com.darbuth.languagesredux.controllers;

import java.util.List;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.darbuth.languagesredux.models.Language;
import com.darbuth.languagesredux.services.LanguageService;

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
			@PathVariable("id") Long id) {
		if (result.hasErrors()) {
			return "index.jsp";
		} else {
			lang.setId(id);
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
		Language language = languageService.findLanguageById(id);
		if (language != null) {
			System.out.print(language.getId());
			model.addAttribute("language", language);
			return "updateLang.jsp";
		}
		return "redirect:/languages";
	}
	
	@Transactional
	@PostMapping("languages/edit/{id}")
	public String updateLanguage(@Valid @ModelAttribute("language") Language language,
			BindingResult result,
			@PathVariable Long id) {
		System.out.println(id);
		System.out.println(language.getId());
		if (result.hasErrors()) {
			return "updateLang.jsp";
		} else {
			System.out.println(id);
			languageService.updateLanguage(language);
			return "redirect:/languages/{id}";
		}
	}
	
	@RequestMapping("languages/delete/{id}")
	public String destroyLanguage(@PathVariable("id") Long id) {
		languageService.destroyLanguage(id);
		return "redirect:/languages";
	}
}
