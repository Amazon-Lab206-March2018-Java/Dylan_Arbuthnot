package com.darbuth.license.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.darbuth.license.models.License;

@Repository
public interface LicenseRepo extends CrudRepository<License, Long> {
	List<License> findAll();
}
