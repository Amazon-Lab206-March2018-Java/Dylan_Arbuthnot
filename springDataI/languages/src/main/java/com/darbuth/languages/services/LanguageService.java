package com.darbuth.languages.services;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Service;

import com.darbuth.languages.models.Language;

@Service
public class LanguageService {

	private List<Language> languages = new ArrayList<Language>(Arrays.asList(
			new Language("Java", "James Gosling", "1.8"),
			new Language("Python", "Guido van Rossum", "3.6"),
			new Language("HTML", "Tim Berners-Lee", "5.1")
			));
	
	public List<Language> allLanguges() {
		return languages;
	}
	
	public void addLanguage(Language lang) {
		languages.add(lang);
	}
	
	public Language findLanguage(int id) {
		if (id < languages.size()) {
			return languages.get(id);
		}
		return null;
	}
	
	public void updateLanguage(int id, Language lang) {
		languages.set(id, lang);
	}
	
	public void destroyLanguage(int id) {
		if (id < languages.size()) {
			languages.remove(id);
		}
	}
}
