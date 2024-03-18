package com.medilab.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.medilab.entity.DoctorEntity;
import com.medilab.entity.LabTechnicianEntity;
import com.medilab.entity.LabTestEntity;
import com.medilab.entity.PatientEntity;
import com.medilab.model.Doctor;
import com.medilab.model.LabTechnician;
import com.medilab.repository.LabTechnicianRepository;
import com.medilab.service.LabTechnicianService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Optional;

@Service
public class LabTechnicianImpl implements LabTechnicianService {
    @Autowired
    LabTechnicianRepository labTechnicianRepository;

    @Autowired
    ObjectMapper mapper;

    @Override
    public LabTechnicianEntity createLabTechnician(LabTechnician labTechnician) {
        LabTechnicianEntity labTechnicianEntity = mapper.convertValue(labTechnician, LabTechnicianEntity.class);
        labTechnicianRepository.save(labTechnicianEntity);
        return labTechnicianEntity;

    }

    @Override
    public ArrayList<LabTechnician> retrieveLabTechnician() {
        ArrayList<LabTechnician> List = new ArrayList<>();
        Iterable<LabTechnicianEntity> allLabTechnician = labTechnicianRepository.findAll();
        Iterator<LabTechnicianEntity> iterator = allLabTechnician.iterator();

        while (iterator.hasNext()) {
            LabTechnicianEntity entity = iterator.next();
            LabTechnician labTechnician = mapper.convertValue(entity, LabTechnician.class);
            List.add(labTechnician);
        }
        return List;
    }

    @Override
    public boolean removeLabTechnician(int id) {
        Optional<LabTechnicianEntity> labTechnicianEntityOptional = labTechnicianRepository.findById(id);
        if (labTechnicianEntityOptional.isPresent()) {
            labTechnicianRepository.deleteById(id);
            return true;
        }
        return false;
    }


}
