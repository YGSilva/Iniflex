package com.project.iniflex.test.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_EMPLOYEE")
public class Employee extends Person {
	private static final long serialVersionUID = 1L;

	private BigDecimal salary;
	private String function;

	public Employee() {
		super();
	}

	public Employee(Long idPerson, String namePerson, LocalDateTime dtBirth, BigDecimal salary, String function) {
		super(idPerson, namePerson, dtBirth);
		this.salary = salary;
		this.function = function;
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
