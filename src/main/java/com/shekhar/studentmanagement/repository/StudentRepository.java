package com.shekhar.studentmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.shekhar.studentmanagement.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}