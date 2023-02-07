package com.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.pojos.Employee;
import com.app.repository.EmployeeRepository;


@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	public EmployeeRepository employeerepository;
	@Override
	public List<Employee> getAllEmployee() {
		return employeerepository.findAll();
	}
	@Override
	public Employee addEmployee(Employee employee) {
		
		return employeerepository.save(employee);
	}
	
	@Override
	public String deleteEmployee(Long id) {
		if(employeerepository.existsById(id)) {
		employeerepository.deleteById(id);
		return "Employee deleted successfully";
	}
		return "Id not found";
	}
	
	@Override
	public Employee udpdateEmployee(Employee employee) {
		if(employeerepository.existsById(employee.getId())) {
			employeerepository.save(employee);
			System.out.println("updated successfully");
		}
		return employee;
	}
	
	
}
