package com.titulation.student.configurator.domain.repository;

import com.titulation.student.configurator.domain.model.Student;
import java.util.List;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {
    
    public List<Student> findByIdAlumno(String boleta); 
    
}
