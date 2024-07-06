package com.java.studentms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.studentms.entiry.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}
