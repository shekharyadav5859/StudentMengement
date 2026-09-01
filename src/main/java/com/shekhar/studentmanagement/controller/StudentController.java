package com.shekhar.studentmanagement.controller;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.shekhar.studentmanagement.entity.Student;
import com.shekhar.studentmanagement.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService service;

    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        return service.saveStudent(student);
    }

     @GetMapping
    public List<Student> getAllStudents() {
        return service.getAllStudents();
    }

    @DeleteMapping("/{id}")
public String deleteStudent(@PathVariable Long id) {
    service.deleteStudent(id);
    return "Student Deleted Successfully";
}

@PutMapping("/{id}")
public Student updateStudent(@PathVariable Long id,
                             @RequestBody Student student) {

    return service.updateStudent(id, student);
}
}