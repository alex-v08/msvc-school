package com.microservice.student.controller;

import com.microservice.student.entity.Student;
import com.microservice.student.service.IstudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/api/students")
public class StudentController {

    private final IstudentService studentService;

    @Autowired
    public StudentController(IstudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@RequestBody Student student) {
        studentService.save(student);
    }

    public ResponseEntity<?> findAll(){
        return ResponseEntity.ok(studentService.findAll());
    }

   @GetMapping("/search/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id){
        return ResponseEntity.ok(studentService.findById(id));
   }


    @GetMapping("/search/course/{courseId}")
   public ResponseEntity<?> findByCourseId(@PathVariable Long courseId){
        return ResponseEntity.ok(studentService.findByCourseId(courseId));
   }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Long id){
        studentService.deleteById(id);
    }
}
