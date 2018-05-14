package com.darbuth.pagination.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.darbuth.pagination.models.Ninja;

public interface NinjaRepo extends PagingAndSortingRepository<Ninja, Long> {

	@Query("SELECT n from Ninja n")
	Page<Ninja> findAllNinjas(Pageable pageable);

	@Query("SELECT d.name, n.firstName, n.lastName FROM Ninja n JOIN n.dojo d")
	Page<Object[]> findNinjasByDojo(Pageable pageable);
}
