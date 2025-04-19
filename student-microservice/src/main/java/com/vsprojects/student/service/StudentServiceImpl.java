package com.vsprojects.student.service;

import com.vsprojects.student.entity.Student;
import com.vsprojects.student.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    private StudentRepository studentRepository;

    @Override
    public List<Student> findAll() {
        return (List<Student>) studentRepository.findAll();
    }

    @Override
    public Student findById(Long id) {
        return studentRepository.findById(id).orElseThrow();
    }

    @Override
    public List<Student> findByIdCourse(Long idCourse) {
        return studentRepository.findByIdCourse(idCourse);
    }

    @Override
    public Student save(Student student) {
       return studentRepository.save(student);
    }

}
