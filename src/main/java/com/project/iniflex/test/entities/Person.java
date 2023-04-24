package com.project.iniflex.test.entities;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_pessoa")
public class Person implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idPerson;
	private String namePerson;
	private LocalDateTime dtBirth;
	
	public Person() {
		super();
	}

	public Person(Long idPerson, String namePerson, LocalDateTime dtBirth) {
		super();
		this.idPerson = idPerson;
		this.namePerson = namePerson;
		this.dtBirth = dtBirth;
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

	@Override
	public int hashCode() {
		return Objects.hash(idPerson);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(idPerson, other.idPerson);
	}

	
}