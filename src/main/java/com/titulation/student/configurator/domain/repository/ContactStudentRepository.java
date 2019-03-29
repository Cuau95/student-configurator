package com.titulation.student.configurator.domain.repository;

import com.titulation.student.configurator.domain.model.ContactStudent;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactStudentRepository extends CrudRepository<ContactStudent, Integer> {
    
    public List<ContactStudent> findByIdAlumno(String idAlumno);

}
