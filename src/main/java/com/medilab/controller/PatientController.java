package com.medilab.controller;


import com.medilab.entity.PatientEntity;
import com.medilab.model.Patient;
import com.medilab.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

@RestController
@RequestMapping("/patient")
@CrossOrigin
public class PatientController {

    @Autowired
    PatientService patientService;

    @PostMapping("/add")
    public PatientEntity addPatient(@RequestBody Patient patient) {
        return patientService.createPatient(patient);
    }

    @GetMapping("/get")
    ArrayList<Patient> getPatient() {
        return patientService.retrievePatient();
    }

    @DeleteMapping("{id}")
    Map<String, String> deletePatient(@PathVariable int id) {
        boolean isRemoved = patientService.removePatient(id);
        if (isRemoved) {
            return Collections.singletonMap("Status", "Patient Removed");

        } else {
            return Collections.singletonMap("Status", "Patient ID not found");
        }
    }

}
