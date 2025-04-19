package com.vsprojects.student.service;

import com.vsprojects.student.entity.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    List<Student> findAll();
    Student findById(Long id);
    List<Student> findByIdCourse(Long idCourse);
    Student save(Student student);
}
