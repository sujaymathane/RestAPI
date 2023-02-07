package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojos.Employee;
import com.app.service.EmployeeServiceImpl;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	public EmployeeServiceImpl employservice;
	
	
	@GetMapping
	public List<Employee> getAllEmployee(){
		return employservice.getAllEmployee();
	}
	
	@PostMapping
	public Employee addEmployee(@RequestBody Employee employee) {
		return employservice.addEmployee(employee);
	}
	
	
	@DeleteMapping("/{empid}")
	public String deleteEmployee(@PathVariable Long empid) {
		return employservice.deleteEmployee(empid);
	}
	
	@PutMapping
	public Employee updateEMployee(@RequestBody Employee employee) {
		return employservice.udpdateEmployee(employee);
	}
	

}
