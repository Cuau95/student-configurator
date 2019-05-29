package com.titulation.student.configurator.domain.repository;

import com.titulation.student.configurator.domain.model.ContactStudent;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactStudentRepository extends CrudRepository<ContactStudent, Integer> {
    
    public ContactStudent findByIdAlumno(String idAlumno);

}
