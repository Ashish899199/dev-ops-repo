package com.java.studentms.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.studentms.entiry.Student;
import com.java.studentms.service.StudentServiceImpl;

@RestController
@RequestMapping(value="/student")
public class StudentController {
    @Autowired
    StudentServiceImpl serviceImpl;
	
	@GetMapping("/getAll")
	public List<Student> getAllStudent(){
		Sysotem.out.println("Get student List");
		return serviceImpl.getAllStudents();
	}
	

	@GetMapping("/get/{id}")
	public Student getStudentById(@PathVariable long id){
		System.out.println("Student ID:::"+id);
		return serviceImpl.getStudent(id);
	}
	
	@PostMapping("/add")
	public Student addStudent(@RequestBody Student student) {
		return serviceImpl.addStudent(student);
	}
	@PostMapping("/update")
	public Student updateStudent(@RequestBody Student student) {
		System.out.println("Student ID:::"+student.getSid());
		return serviceImpl.updateStudent(student);
	}
	
	@GetMapping("/delete/{id}")
	public String deleteStudentById(@PathVariable long id){
		System.out.println("Student ID:::"+id);
		 serviceImpl.deleteStudent(id);
		 return "Student record deleted successfully";
	}
}
