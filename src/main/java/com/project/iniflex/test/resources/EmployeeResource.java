package com.project.iniflex.test.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.iniflex.test.dto.EmployeeDTO;
import com.project.iniflex.test.entities.Employee;
import com.project.iniflex.test.services.EmployeeService;

@RestController
@RequestMapping(value = "/employees")
public class EmployeeResource {

	@Autowired
	private EmployeeService service;

	@GetMapping
	public ResponseEntity<List<EmployeeDTO>> findAll() {
		List<EmployeeDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/GroupByFunction")
	public List<Employee> groupByFunction() {
		return service.groupByFunction();
	}

	@GetMapping(value = "/MonthOfBirthDay")
	public List<Employee> monthOfBirthDay() {
		return service.monthOfBirthDay();
	}

	@GetMapping(value = "/AlphabeticalOrder")
	public List<Employee> alphabeticalOrder() {
		return service.alphabeticalOrder();
	}
	
	@GetMapping(value = "/OlderEmployee")
	public String olderEmployee() {
		return service.olderEmployee();
	}
	
	@GetMapping(value = "/SumSalary")
	public double sumSalary() {
		return service.sumSalary();
	}
	
	@GetMapping(value = "/MinSalary")
	public List<String> minSalary() {
		return service.minSalary();
	}

	@PutMapping(value = "/updateSalary")
	public int updateSalary() {
		return service.updateSalary();
	}

	@DeleteMapping(value = "/{id}")
	public ResponseEntity<EmployeeDTO> deleteEmployee(@PathVariable Long id) {
		service.delete(id);
		return ResponseEntity.noContent().build();
	}

}
