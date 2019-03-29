package com.titulation.student.configurator.infrastructure.controller;

import static org.springframework.http.HttpStatus.OK;

import com.titulation.student.configurator.domain.model.Career;
import com.titulation.student.configurator.domain.service.CareerService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class CareerController {
    
    private CareerService careerService;

    @Autowired
    public CareerController(CareerService careerService) {
        this.careerService = careerService;
    }
    
    @GetMapping("/carrera/{nombre}")
    public ResponseEntity<List<Career>> getCareerByName(@PathVariable("nombre") String nameCareer) {
        return new ResponseEntity<>(careerService.getCareerByName(nameCareer), OK);
    }
    
}
