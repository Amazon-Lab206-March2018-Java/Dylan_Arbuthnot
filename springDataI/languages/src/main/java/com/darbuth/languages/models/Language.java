package com.darbuth.languages.models;

import javax.validation.constraints.Size;

public class Language {
	@Size(min = 2, max = 20, message = "must be 3-20 characters")
	private String name;
	
	@Size(min = 2, max = 20, message = "must be 3-20 characters")
	private String creator;
	
	@Size(min = 1, message = "cannot be empty")
	private String currentVersion;
	
	public Language() {
	}
	
	public Language(String name, String creator, String version) {
		this.name = name;
		this.creator = creator;
		this.currentVersion = version;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getCurrentVersion() {
		return currentVersion;
	}

	public void setCurrentVersion(String currentVersion) {
		this.currentVersion = currentVersion;
	}
	
}
