package com.titulation.student.configurator.infrastructure.controller;

import com.titulation.student.configurator.domain.model.Campus;
import com.titulation.student.configurator.domain.service.CampusService;
import org.springframework.beans.factory.annotation.Autowired;
import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.BAD_REQUEST;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class CampusController {

    private CampusService campusService;

    @Autowired
    public CampusController(CampusService campusService) {
        this.campusService = campusService;
    }

    @PostMapping("/campus")
    public ResponseEntity<Campus> saveCampus(@RequestBody Campus campus) {
        try {
            return new ResponseEntity<>(campusService.saveCampus(campus), CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, BAD_REQUEST);
        }
    }

}
