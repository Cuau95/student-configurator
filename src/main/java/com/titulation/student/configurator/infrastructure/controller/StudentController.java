package com.titulation.student.configurator.infrastructure.controller;

import com.titulation.student.configurator.domain.model.Student;
import com.titulation.student.configurator.domain.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class StudentController {

    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/")
    public Student getStudent() {
        return studentService.getStudent();
    }
    
    @PostMapping("/")
    public Student postStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }

}
