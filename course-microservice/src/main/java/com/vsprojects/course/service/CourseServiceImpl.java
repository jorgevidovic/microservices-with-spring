package com.vsprojects.course.service;

import com.vsprojects.course.client.StudentClient;
import com.vsprojects.course.dto.StudentDTO;
import com.vsprojects.course.entity.Course;
import com.vsprojects.course.http.response.StudentsByCourseResponse;
import com.vsprojects.course.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    private CourseRepository courseRepository;
    private StudentClient studentClient;


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

    @Override
    public StudentsByCourseResponse findStudentsByCourse(Long id) {
        Course course = courseRepository.findById(id).orElseThrow();
        List<StudentDTO> students = studentClient.findByIdCourse(id);

        return StudentsByCourseResponse.builder()
                .course(course.getName())
                .description(course.getDescription())
                .students(students)
                .build();
    }
}
