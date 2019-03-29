package com.titulation.student.configurator.domain.service;

import com.titulation.student.configurator.domain.model.Campus;
import com.titulation.student.configurator.domain.repository.CampusRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CampusService {
    
    private CampusRepository campusRepository;

    @Autowired
    public CampusService(CampusRepository campusRepository) {
        this.campusRepository = campusRepository;
    }
    
    public List<Campus> getCampusByName(String campus) {
        return campusRepository.findByNombreEscuela(campus);
    }
    
}
