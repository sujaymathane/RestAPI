package com.app.service;

import java.util.List;

import com.app.pojos.Student;

public interface StudentService {
	List<Student> getAllStudentDetails();
	
	Student addStudent(Student student);
	
	String deleteStudent(Long id);
	
	Student updateStudent(Student student);
}
