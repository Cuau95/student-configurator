package com.titulation.student.configurator.infrastructure.controller;

import com.titulation.student.configurator.domain.model.Campus;
import com.titulation.student.configurator.domain.service.CampusService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class CampusController {
    
    private CampusService campusService;
    
    @GetMapping("/campus")
    public Campus saveCampus(@RequestBody Campus campus) {
        return campusService.saveCampus(campus);
    }
    
}
