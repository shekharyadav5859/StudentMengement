package com.shekhar.studentmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shekhar.studentmanagement.entity.Student;
import com.shekhar.studentmanagement.repository.StudentRepository;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }


    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }

    public Student updateStudent(Long id, Student student) {

    Student existingStudent = studentRepository.findById(id).orElse(null);

    if (existingStudent != null) {
        existingStudent.setStudentClass(student.getStudentClass());
        existingStudent.setAddress(student.getAddress());
        existingStudent.setDateOfBirth(student.getDateOfBirth());

        return studentRepository.save(existingStudent);
    }

    return null;
}
}