package com.project.iniflex.test.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.iniflex.test.dto.PersonDTO;
import com.project.iniflex.test.entities.Person;
import com.project.iniflex.test.repositories.PersonRepository;
import com.project.iniflex.test.services.exceptions.DatabaseException;

@Service
public class PersonService {

	@Autowired
	private PersonRepository repository;
	
	@Transactional(readOnly = true)
	public List<PersonDTO> findAll() {
		List<Person> list = repository.findAll();
		
		//Transforma a lista do tipo Person em PersonDTO
		return list.stream().map(x -> new PersonDTO(x)).collect(Collectors.toList());		
	}

	public void delete(Long id) { 
		try {
			repository.deleteById(id);
		} catch (DataIntegrityViolationException e) {
			throw new DatabaseException("Violação de Integridade");
		}
	}
}