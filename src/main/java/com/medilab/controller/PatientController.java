package com.medilab.controller;

import com.medilab.entity.PatientEntity;
import com.medilab.model.Patient;
import com.medilab.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class PatientController {

    @Autowired
    PatientService patientService;

    @PostMapping("/addpatient")
    public PatientEntity addPatient(@RequestBody Patient patient){
        return patientService.createPatient(patient);
    }

    @GetMapping("/getpatient")
    ArrayList<Patient> getPatient(){
        return patientService.retrievePatient();
    }




}
