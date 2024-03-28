package com.microservice.course.client;


import com.microservice.course.dto.StudentDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "mscv-student", url = "http://localhost:8080/api/students/")
public interface IStudentClient {

    @GetMapping("/search/course/{courseId}")
    List<StudentDto> findAllStudentByCourseId(@PathVariable Long courseId);
}
