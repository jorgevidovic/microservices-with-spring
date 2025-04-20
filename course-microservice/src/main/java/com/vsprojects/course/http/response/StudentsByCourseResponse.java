package com.vsprojects.course.http.response;

import com.vsprojects.course.dto.StudentDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class StudentsByCourseResponse {
    private String name;
    private String description;
    private List<StudentDTO> students;
}
