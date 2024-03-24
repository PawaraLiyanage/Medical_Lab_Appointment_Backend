package com.medilab.service;

import com.medilab.entity.LabTestEntity;
import com.medilab.model.LabTest;

import java.util.ArrayList;

public interface LabTestService {

    LabTestEntity createLabTest(LabTest labTest);

    ArrayList<LabTest> viewLabTest();

    LabTest findByTestName(String testName);

    boolean deleteLabTest(int id);


}
