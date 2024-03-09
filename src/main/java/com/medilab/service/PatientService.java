package com.medilab.service;

import com.medilab.entity.PatientEntity;
import com.medilab.model.Patient;

import java.util.ArrayList;

public interface PatientService {

    PatientEntity createPatient(Patient patient);

    ArrayList<Patient> retrievePatient();


}
