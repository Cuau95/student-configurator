package com.titulation.student.configurator.domain.service;

import com.titulation.student.configurator.domain.model.Student;
import com.titulation.student.configurator.domain.repository.StudentRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    
    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    
    public List<Student> getStudent(String boleta) {
        return studentRepository.findByIdAlumno(boleta);
    }
    
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }
}
