package com.java.studentms.service;

import java.util.List;

import com.java.studentms.entiry.Student;

public interface StudentService {

	public List<Student> getAllStudents();

	public Student getStudent(long id);

	public Student addStudent(Student std);

	public Student updateStudent(Student std);
	
	public void deleteStudent(long id);
}
