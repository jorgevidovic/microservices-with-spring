package com.vsprojects.student.controller;

import com.vsprojects.student.entity.Student;
import com.vsprojects.student.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private StudentService studentService;

    @GetMapping
    public ResponseEntity<List<Student>> findAll() {
        return ResponseEntity.ok(studentService.findAll());
    }

    @GetMapping ("/{id}")
    public ResponseEntity<Student> findById(@PathVariable Long id){
        return ResponseEntity.ok(studentService.findById(id));
    }

    @GetMapping ("/course/{idCourse}")
    public ResponseEntity<List<Student>> findByIdCourse(@PathVariable Long idCourse){
        return ResponseEntity.ok(studentService.findByIdCourse(idCourse));
    }

    @PostMapping()
    public ResponseEntity<Student> saveStudent(@Valid @RequestBody Student student) {
        return ResponseEntity.ok(studentService.save(student));
    }

}
