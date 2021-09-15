package com.vishal.springdata.employee.repos;

import org.springframework.data.repository.CrudRepository;

import com.vishal.springdata.employee.entities.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
	

}
