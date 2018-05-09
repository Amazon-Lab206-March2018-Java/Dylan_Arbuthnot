package com.darbuth.license.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.darbuth.license.models.License;
import com.darbuth.license.repositories.LicenseRepo;

@Service
public class LicenseService {
	
	private final LicenseRepo lr;
	public LicenseService(LicenseRepo lr) {
		this.lr = lr;
	}
	
	public List<License> allLicenses() {
		return lr.findAll();
	}

	public void addLicense(License license) {
		lr.save(license);
	}
}
