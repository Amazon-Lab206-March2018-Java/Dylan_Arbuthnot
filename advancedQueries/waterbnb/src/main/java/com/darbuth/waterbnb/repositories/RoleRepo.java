package com.darbuth.waterbnb.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.darbuth.waterbnb.models.Role;

@Repository
public interface RoleRepo extends CrudRepository<Role, Long> {

	List<Role> findAll();
	
	List<Role> findByName(String name);
	
	@Query("SELECT r FROM Role r WHERE r.name = ?1 OR r.name = ?2")
	List<Role> findRolesByName(String name1, String name2);
}
