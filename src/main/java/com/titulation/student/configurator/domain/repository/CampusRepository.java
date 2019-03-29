package com.titulation.student.configurator.domain.repository;

import com.titulation.student.configurator.domain.model.Campus;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CampusRepository extends CrudRepository<Campus, Integer> {
    
    public List<Campus> findByNombreEscuela(String campusName);

}
