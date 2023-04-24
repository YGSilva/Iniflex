package com.project.iniflex.test.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.iniflex.test.entities.Person;
import com.project.iniflex.test.repositories.PersonRepository;

@Service
public class PersonService {

	@Autowired
	private PersonRepository repository;
	
	@Transactional(readOnly = true)
	public List<Person> findAll() {
		return repository.findAll();
	}
}