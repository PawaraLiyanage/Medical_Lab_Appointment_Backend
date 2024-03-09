package com.medilab.controller;

import com.medilab.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientController {

    @Autowired
    PatientService patientService;




}
