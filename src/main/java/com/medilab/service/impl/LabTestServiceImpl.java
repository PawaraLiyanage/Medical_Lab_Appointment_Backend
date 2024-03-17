package com.medilab.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.medilab.entity.LabTestEntity;
import com.medilab.model.LabTest;
import com.medilab.repository.LabTestRepository;
import com.medilab.service.LabTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;

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

    @Override
    public ArrayList<LabTest> viewLabTest() {
        ArrayList<LabTest> List = new ArrayList<>();
        Iterable<LabTestEntity> allLabTest = labTestRepository.findAll();
        Iterator<LabTestEntity> iterator = allLabTest.iterator();

        while (iterator.hasNext()) {
            LabTestEntity entity = iterator.next();
            LabTest labTest = mapper.convertValue(entity, LabTest.class);
            List.add(labTest);
        }
        return List;
    }

    @Override
    public LabTest findByTestName(String testName) {
        return mapper.convertValue(labTestRepository.findByTestName(testName),LabTest.class);
    }
}







