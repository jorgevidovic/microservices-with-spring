package com.vsprojects.course.client;

import com.vsprojects.course.dto.StudentDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "student-msvc", url = "http://localhost:8091/api/students")
public interface StudentClient {
    @GetMapping("/course/{idCourse}")
   List<StudentDTO> findByIdCourse(@PathVariable Long idCourse);
}
