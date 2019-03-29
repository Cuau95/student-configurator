package com.titulation.student.configurator.infrastructure.controller;

import com.titulation.student.configurator.domain.model.Campus;
import com.titulation.student.configurator.domain.service.CampusService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.BAD_REQUEST;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class CampusController {

    private CampusService campusService;

    @Autowired
    public CampusController(CampusService campusService) {
        this.campusService = campusService;
    }

    @GetMapping("/campus/{name}")
    public ResponseEntity<List<Campus>> saveCampus(@PathVariable("name") String campusName) {
        try {
            return new ResponseEntity<>(campusService.getCampusByName(campusName), CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, BAD_REQUEST);
        }
    }

}
