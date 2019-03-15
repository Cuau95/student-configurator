package com.titulation.student.configurator.infrastructure.controller;

import static org.springframework.http.HttpStatus.OK;
import static org.springframework.http.HttpStatus.FOUND;
//import static org.springframework.http.HttpStatus.NOT_FOUND;
//import static org.springframework.http.HttpStatus.NOT_MODIFIED;

import com.titulation.student.configurator.domain.model.Student;
import com.titulation.student.configurator.domain.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/boleta/{boleta}")
    public ResponseEntity<Student> getStudent(@PathVariable("boleta") String boleta) {
        return new ResponseEntity<>(studentService.getStudent(boleta), OK);
    }

    @PostMapping("/")
    public ResponseEntity<Student> postStudent(@RequestBody Student student) {
        return new ResponseEntity<>(studentService.saveStudent(student), FOUND);
    }

}
