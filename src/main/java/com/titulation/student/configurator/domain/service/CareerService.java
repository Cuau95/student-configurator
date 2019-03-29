package com.titulation.student.configurator.domain.service;

import com.titulation.student.configurator.domain.model.Career;
import com.titulation.student.configurator.domain.repository.CareerRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CareerService {
    
    private CareerRepository careerRepository;

    @Autowired
    public CareerService(CareerRepository careerRepository) {
        this.careerRepository = careerRepository;
    }
    
    public List<Career> getCareerByName(String nameCareer) {
        return careerRepository.findByNombreCarrera(nameCareer);
    }
    
}
