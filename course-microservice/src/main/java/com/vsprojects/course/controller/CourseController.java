package com.vsprojects.course.controller;

import com.vsprojects.course.entity.Course;
import com.vsprojects.course.service.CourseService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
public class CourseController {
    private CourseService courseService;

    @GetMapping
    public ResponseEntity<List<Course>> findAll() {
        return ResponseEntity.ok(courseService.findAll());
    }

    @GetMapping ("/{id}")
    public ResponseEntity<Course> findById(@PathVariable Long id){
        return ResponseEntity.ok(courseService.findById(id));
    }

    @PostMapping()
    public ResponseEntity<Course> saveStudent(@Valid @RequestBody Course course) {
        return ResponseEntity.ok(courseService.save(course));
    }

    @GetMapping("/students/{id}")
    public ResponseEntity<?> findStudentsByCourse(@PathVariable Long id) {
        return ResponseEntity.ok(courseService.findStudentsByCourse(id));
    }
}
