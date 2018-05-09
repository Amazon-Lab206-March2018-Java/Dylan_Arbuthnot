package com.darbuth.license.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.darbuth.license.models.Person;
import com.darbuth.license.repositories.PersonRepo;

@Service
public class PersonService {

	private final PersonRepo pr;
	public PersonService(PersonRepo pr) {
		this.pr = pr;
	}
	
	public List<Person> allPersons() {
		return pr.findAll();
	}
	
	public void addPerson(Person person) {
		pr.save(person);
	}
}
