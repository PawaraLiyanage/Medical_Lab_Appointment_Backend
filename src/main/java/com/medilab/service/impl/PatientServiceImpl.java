package com.medilab.service.impl;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.medilab.entity.PatientEntity;
import com.medilab.model.Patient;
import com.medilab.repository.PatientRepository;
import com.medilab.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;

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

    @Override
    public ArrayList<Patient> retrievePatient() {
        ArrayList<Patient> List = new ArrayList<>();
        Iterable<PatientEntity> allPatients = patientRepository.findAll();
        Iterator<PatientEntity> iterator = allPatients.iterator();

        while (iterator.hasNext()) {
            PatientEntity entity = iterator.next();
            Patient patient = mapper.convertValue(entity, Patient.class);
            List.add(patient);
        }
        return List;
    }
}
