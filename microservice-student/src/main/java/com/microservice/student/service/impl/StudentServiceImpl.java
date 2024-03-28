package com.microservice.student.service.impl;

import com.microservice.student.entity.Student;
import com.microservice.student.persistence.StudentRepository;
import com.microservice.student.service.IstudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements IstudentService {


    private final StudentRepository studentRepository;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }




    @Override
    public List<Student> findAll() {

        return (List<Student>) studentRepository.findAll();
    }

    @Override
    public Student findById(Long id) {

        return studentRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Student student) {

            studentRepository.save(student);


    }

    @Override
    public void deleteById(Long id) {

            studentRepository.deleteById(id);


    }

    @Override
    public List<Student> findByCourseId(Long courseId) {

            return studentRepository.findByCourseId(courseId);

    }
}
