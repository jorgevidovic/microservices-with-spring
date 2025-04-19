package com.vsprojects.course.service;

import com.vsprojects.course.entity.Course;

import java.util.List;

public interface CourseService  {
    List<Course> findAll();
    Course findById(Long id);
    Course save(Course course);
}
