package com.project.iniflex.test.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.project.iniflex.test.entities.Person;

public class PersonDTO implements Serializable{

	private static final long serialVersionUID = 1L;

	private Long idPerson;
	private String namePerson;
	private LocalDateTime dtBirth;

	public PersonDTO() {
		super();
	}

	public PersonDTO(Long idPerson, String namePerson, LocalDateTime dtBirth) {
		super();
		this.idPerson = idPerson;
		this.namePerson = namePerson;
		this.dtBirth = dtBirth;
	}

	public PersonDTO(Person entity) {
		this.idPerson = entity.getIdPerson();
		this.namePerson = entity.getNamePerson();
		this.dtBirth = entity.getDtBirth();
	}

	public Long getIdPerson() {
		return idPerson;
	}

	public void setIdPerson(Long idPerson) {
		this.idPerson = idPerson;
	}

	public String getNamePerson() {
		return namePerson;
	}

	public void setNamePerson(String namePerson) {
		this.namePerson = namePerson;
	}

	public LocalDateTime getDtBirth() {
		return dtBirth;
	}

	public void setDtBirth(LocalDateTime dtBirth) {
		this.dtBirth = dtBirth;
	}
}
