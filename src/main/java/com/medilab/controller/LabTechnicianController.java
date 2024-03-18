package com.medilab.controller;

import com.medilab.entity.LabTechnicianEntity;
import com.medilab.model.LabTechnician;
import com.medilab.model.Patient;
import com.medilab.service.LabTechnicianService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

@RestController
@RequestMapping("/labtechnician")
@CrossOrigin
public class LabTechnicianController {

    @Autowired
    LabTechnicianService labTechnicianService;

    @PostMapping("/add")
    public LabTechnicianEntity addLabTechnician(@RequestBody LabTechnician labTechnician){
        return labTechnicianService.createLabTechnician(labTechnician);
    }

    @GetMapping("/get")
    ArrayList<LabTechnician> getLabTechnician() {
        return labTechnicianService.retrieveLabTechnician();
    }

    @DeleteMapping("{id}")
    Map<String, String> deleteLabTechnician(@PathVariable int id) {
        boolean isRemoved = labTechnicianService.removeLabTechnician(id);
        if (isRemoved) {
            return Collections.singletonMap("Status", "LabTechnician is Removed");

        } else {
            return Collections.singletonMap("Status", "LabTechnician ID not found");
        }
    }


}
