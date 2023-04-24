package com.project.iniflex.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.iniflex.test.entities.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long>{

}