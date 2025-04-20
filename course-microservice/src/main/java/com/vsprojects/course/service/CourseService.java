package com.vsprojects.course.service;

import com.vsprojects.course.entity.Course;
import com.vsprojects.course.http.response.StudentsByCourseResponse;

import java.util.List;

public interface CourseService {
    List<Course> findAll();

    Course findById(Long id);

    Course save(Course course);

    StudentsByCourseResponse findStudentsByCourse(Long id);
}
