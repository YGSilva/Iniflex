package com.project.iniflex.test.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.iniflex.test.dto.PersonDTO;
import com.project.iniflex.test.services.PersonService;

@RestController
@RequestMapping(value="/people")
public class PersonResource {
	
	@Autowired
	private PersonService service;
	
	@GetMapping
	public ResponseEntity<List<PersonDTO>> findAll() {
		List<PersonDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@DeleteMapping(value="/{id}")
	public ResponseEntity<PersonDTO> deletePerson(@PathVariable Long id){
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
 	
}
