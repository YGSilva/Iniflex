package com.project.iniflex.test.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.iniflex.test.dto.EmployeeDTO;
import com.project.iniflex.test.entities.Employee;
import com.project.iniflex.test.repositories.EmployeeRepository;
import com.project.iniflex.test.services.exceptions.DatabaseException;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository repository;

	@Transactional(readOnly = true)
	public List<EmployeeDTO> findAll() {
		List<Employee> list = repository.findAll();
		return list.stream()
				.map(x -> new EmployeeDTO(x.getIdPerson(), x.getNamePerson(), (x.getDtBirth()), x))
				.collect(Collectors.toList());
	}
	
	public List<Employee> groupByFunction() {
		return repository.getGroupByFunction();
	}
	
	public int updateSalary() {
		return repository.updateSalary();
	}
	
	public List<Employee> monthOfBirthDay() {
		return repository.monthOfBirthDay();
	}
	
	public List<Employee> alphabeticalOrder() {
		return repository.alphabeticalOrder();
	}
	
	public String olderEmployee() {
		return repository.olderEmployee();
	}
	
	public double sumSalary() {
		return repository.sumSalary();
	}
	
	public List<String> minSalary() {
		return repository.minSalary();
	}
	
	public void delete(Long id) { 
		try {
			repository.deleteById(id);
		} catch (DataIntegrityViolationException e) {
			throw new DatabaseException("Violação de Integridade");
		}
	}

}
