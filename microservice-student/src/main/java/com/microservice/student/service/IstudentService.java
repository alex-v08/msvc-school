package com.microservice.student.service;

import com.microservice.student.entity.Student;

import java.util.List;

public interface IstudentService {
    List<Student> findAll();
    Student findById(Long id);
    void save(Student student);
    void deleteById(Long id);
    List<Student> findByCourseId(Long courseId);


}
