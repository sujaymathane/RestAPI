package com.app.service;

import java.util.List;

import com.app.pojos.Employee;

public interface EmployeeService {

	
	List<Employee> getAllEmployee();
	Employee addEmployee(Employee employee);
	String deleteEmployee(Long id);
	Employee udpdateEmployee(Employee employee);
	
}
