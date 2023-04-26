package com.project.iniflex.test.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.project.iniflex.test.entities.Employee;
import com.project.iniflex.test.entities.Person;

public class EmployeeDTO extends Person {
	private static final long serialVersionUID = 1L;

	private BigDecimal salary;
	private String function;

	public EmployeeDTO() {
		super();
	}

	public EmployeeDTO(Long idPerson, String namePerson, LocalDateTime dtBirth, Employee entity) {
		super(idPerson, namePerson, dtBirth);
		this.salary = entity.getSalary();
		this.function = entity.getFunction();
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public String getFunction() {
		return function;
	}

	public void setFunction(String function) {
		this.function = function;
	}
}
