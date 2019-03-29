package com.titulation.student.configurator.domain.repository;

import com.titulation.student.configurator.domain.model.Career;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CareerRepository extends CrudRepository<Career, Integer> {
    
    public List<Career> findByNombreCarrera(String nameCareer);

}
