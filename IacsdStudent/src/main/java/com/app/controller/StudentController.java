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

import com.app.pojos.Student;
import com.app.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private StudentService studentservice;
	@GetMapping
	public List<Student> getallStudents(){
		return studentservice.getAllStudentDetails();
	}
	
	@PostMapping
	public Student addStudent(@RequestBody Student student)
	{
		return studentservice.addStudent(student);
	}
	
	
	@DeleteMapping("/{sid}")
	public String deleteStudentDetails(@PathVariable Long sid) {
		return studentservice.deleteStudent(sid);
	}
	
	
	@PutMapping
	public Student updateStudent(@RequestBody Student student) {
		return studentservice.updateStudent(student);
	}
	
	
}
