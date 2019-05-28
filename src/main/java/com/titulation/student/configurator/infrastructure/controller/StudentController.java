package com.titulation.student.configurator.infrastructure.controller;

import com.titulation.student.configurator.domain.model.ContactStudent;
import com.titulation.student.configurator.domain.model.PasswordResponse;
import static org.springframework.http.HttpStatus.OK;
import static org.springframework.http.HttpStatus.FOUND;
import static org.springframework.http.HttpStatus.NOT_FOUND;
import static org.springframework.http.HttpStatus.NOT_MODIFIED;

import com.titulation.student.configurator.domain.model.Student;
import com.titulation.student.configurator.domain.service.ContactStudentService;
import com.titulation.student.configurator.domain.service.StudentService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

    private StudentService studentService;
    private ContactStudentService contactStudentService;

    @Autowired
    public StudentController(StudentService studentService, ContactStudentService contactStudent) {
        this.studentService = studentService;
        this.contactStudentService = contactStudent;
    }

    @GetMapping("/boleta/{boleta}")
    public ResponseEntity<Student> getStudent(@PathVariable("boleta") String boleta) {
        Student student = studentService.getStudent(boleta);
        return (student == null) ? new ResponseEntity<>(student, NOT_FOUND) : new ResponseEntity<>(student, FOUND);
    }

    @PostMapping("/id/{boleta}")
    public ResponseEntity<Student> postStudent(@RequestBody Student student, @PathVariable("boleta") String boleta) {
        student.setId(boleta);
        Student studentSaved = studentService.saveStudent(student);
        return (studentSaved == null) ? new ResponseEntity<>(studentSaved, NOT_MODIFIED) : new ResponseEntity<>(studentSaved, OK);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/contacto/boleta/{boleta}")
    public ResponseEntity<List<ContactStudent>> getContactStudent(@PathVariable("boleta") String boleta) {
        return new ResponseEntity<>(contactStudentService.getContactStudentById(boleta), OK);
    }

    @PostMapping("/contacto/id/{boleta}")
    public ResponseEntity<ContactStudent> postContactStudent(@RequestBody ContactStudent contactStudent, @PathVariable("boleta") String boleta) {
        contactStudent.setIdAlumno(boleta);
        return new ResponseEntity<>(contactStudentService.saveContactStudent(contactStudent), OK);
    }
    
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/usuario/{idStudent}/password/{password}")
    public ResponseEntity<PasswordResponse> passwordCheck(@PathVariable("idStudent") String idStudent, 
            @PathVariable("password") String password) {
        PasswordResponse passwordResponse = new PasswordResponse();
        String passwordCheck = studentService.passwordCheck(idStudent, password);
        passwordResponse.setPasswordResponse(passwordCheck);
        HttpStatus status = NOT_FOUND;
        if(passwordCheck.equals("pass")) {
            status = OK;
        }
        return new ResponseEntity<>(passwordResponse, status);
    }

}
