package com.microservice.course.service.impl;

import com.microservice.course.client.IStudentClient;
import com.microservice.course.dto.StudentDto;
import com.microservice.course.http.response.StudentByCourseResponse;
import com.microservice.course.model.Course;
import com.microservice.course.repository.CourseRepository;
import com.microservice.course.service.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImple implements ICourseService {

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private IStudentClient studentClient;
    @Override
    public List<Course> findAll() {
        return (List<Course>) courseRepository.findAll();


    }

    @Override
    public Course findById(Long id) {
        return courseRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Course course) {

        courseRepository.save(course);

    }

    @Override
    public void deleteById(Long id) {

        courseRepository.deleteById(id);

    }

    @Override
    public List<Course> findByStudentId(Long studentId) {
        return null;
    }

    @Override
    public StudentByCourseResponse findStudentByCourse(Long courseId) {
        //TODO: CONSULT TO COURSE REPOSITORY
        Course course = courseRepository.findById(courseId).orElse(new Course());
        //todo: OBTAIN STUDENTS BY COURSE

        List<StudentDto> studentDtoList = studentClient.findAllStudentByCourseId(courseId);

        return StudentByCourseResponse.builder()
                .courseName(course.getName())
                .teacher(course.getProfessor())
                .studentDtoList(studentDtoList)
                .build();

    }


}
