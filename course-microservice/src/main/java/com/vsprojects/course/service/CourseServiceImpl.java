package com.vsprojects.course.service;

import com.vsprojects.course.entity.Course;
import com.vsprojects.course.repository.CourseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    private CourseRepository courseRepository;

    @Override
    public List<Course> findAll() {
        return (List<Course>) courseRepository.findAll();
    }

    @Override
    public Course findById(Long id) {
        return courseRepository.findById(id).orElseThrow();
    }

    @Override
    public Course save(Course course) {
        return courseRepository.save(course);
    }
}
