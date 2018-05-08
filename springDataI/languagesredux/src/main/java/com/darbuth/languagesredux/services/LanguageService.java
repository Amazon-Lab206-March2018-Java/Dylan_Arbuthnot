package com.darbuth.languagesredux.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.darbuth.languagesredux.models.Language;
import com.darbuth.languagesredux.repositories.LanguageRepository;

@Service
public class LanguageService {
	
	private LanguageRepository languageRepository;
	public LanguageService(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}
	
	public List<Language> allLanguages() {
		return languageRepository.findAll();
	}
	
	public void addLanguage(Language lang) {
		languageRepository.save(lang);
	}
	
	public Language findLanguageById(Long id) {
		Optional<Language> lang = languageRepository.findById(id);
		if (lang.isPresent()) {
			return lang.get();
		}
		return null;
	}
	
	public void updateLanguage(Language lang) {
		languageRepository.save(lang);
		System.out.println(lang.getId());
	}
	
	public void destroyLanguage(Long id) {
		languageRepository.deleteById(id);
	}
}
