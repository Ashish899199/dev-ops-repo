package com.java.studentms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.studentms.entiry.Student;
import com.java.studentms.repository.StudentRepository;
@Service
public class StudentServiceImpl implements StudentService {
@Autowired
StudentRepository repo;
	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Student getStudent(long id) {
		    Optional<Student> optionalUser = repo.findById(id);
		    System.out.println("After requesting a user in a findUser method");
		    Student student = optionalUser.orElse(null);
		    System.out.println("After unwrapping an optional in a findUser method");
		    return student;
		
	}

	@Override
	public Student addStudent(Student std) {
		// TODO Auto-generated method stub
		return repo.save(std);
	}

	
	@Override
	public Student updateStudent(Student std) { // TODO Auto-generated
		Optional<Student> student = repo.findById(std.getSid());
		Student st = student.orElse(null);
		st.setAddress(std.getAddress());
		return repo.save(st);
	}
	 
   
    @Override
	public void deleteStudent(long id) {
		    repo.deleteById(id);;
	}
}

