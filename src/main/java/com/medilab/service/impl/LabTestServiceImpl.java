package com.medilab.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.medilab.entity.LabTestEntity;
import com.medilab.entity.PatientEntity;
import com.medilab.model.LabTest;
import com.medilab.repository.LabTestRepository;
import com.medilab.service.LabTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LabTestServiceImpl implements LabTestService {

    @Autowired
    LabTestRepository labTestRepository;

    @Autowired
    ObjectMapper mapper;

    @Override
    public LabTestEntity createLabTest(LabTest labTest) {
        LabTestEntity labTestEntity = mapper.convertValue(labTest, LabTestEntity.class);
        labTestRepository.save(labTestEntity);
        return labTestEntity;
    }
}
