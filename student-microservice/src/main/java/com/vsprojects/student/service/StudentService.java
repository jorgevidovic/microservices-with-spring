package com.vsprojects.student.service;

import com.vsprojects.student.entity.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    List<Student> findAll();
    Student findById(Long id);
    List<Student> findByCourseId(Long courseId);
    Student save(Student student);
}
