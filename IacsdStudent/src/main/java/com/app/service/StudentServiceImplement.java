package com.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.centralException.CentralException;
import com.app.pojos.Student;
import com.app.repository.StudentRepo;


@Service
@Transactional
public class StudentServiceImplement implements StudentService {
@Autowired
	private StudentRepo studentrepo;
	
	
	@Override
	public List<Student> getAllStudentDetails() {
		// TODO Auto-generated method stub
		return studentrepo.findAll();
	}


	@Override
	public Student addStudent(Student student) {
		// TODO Auto-generated method stub
		return studentrepo.save(student);
	}


	@Override
	public String deleteStudent(Long id) {
		if(studentrepo.existsById(id)) {
				studentrepo.deleteById(id);
				return "Deleted successfully";
		}
		return "Id not found";
	}


	@Override
	public Student updateStudent(Student student) {
		if(studentrepo.existsById(student.getId())) {
			return studentrepo.save(student);
		}
		throw new CentralException("not found id to update");
	}
	
	

	
}
