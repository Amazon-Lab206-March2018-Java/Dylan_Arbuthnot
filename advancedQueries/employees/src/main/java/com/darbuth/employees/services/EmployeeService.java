package com.darbuth.employees.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.darbuth.employees.models.Employee;
import com.darbuth.employees.repositories.EmployeeRepo;

@Service
public class EmployeeService {
	
	private final EmployeeRepo er;
	public EmployeeService(EmployeeRepo er) {
		this.er = er;
	}
	
	public void createEmployee(Employee e) {
		er.save(e);
	}
	
	public Employee findById(Long id) {
		Optional<Employee> e = er.findById(id);
		if (e != null) {
			return e.get();
		}
		return null;
	}
	
	public Employee findByName(String fn,
			String ln) {
		return er.findByName(fn, ln);
	}

}
