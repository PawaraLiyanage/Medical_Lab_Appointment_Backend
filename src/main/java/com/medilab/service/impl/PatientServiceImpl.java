package com.medilab.service.impl;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.medilab.entity.PatientEntity;
import com.medilab.model.Patient;
import com.medilab.repository.PatientRepository;
import com.medilab.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    PatientRepository patientRepository;
    @Autowired
    ObjectMapper mapper;


    @Override
    public PatientEntity createPatient(Patient patient) {
        PatientEntity patientEntity = mapper.convertValue(patient, PatientEntity.class);
        patientRepository.save(patientEntity);
        return patientEntity;

    }
}
