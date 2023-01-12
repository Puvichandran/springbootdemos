package com.example.training.manageemployees;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeService {
	@Autowired
	EmployeeRepository repository;
	
	public boolean createEmployee(Employee newEmp) {
		return repository.createEmployee(newEmp);
	}
	
	public Employee findEmployeeById(Integer empId) {
		return repository.findEmployeeById(empId);
	}


}
