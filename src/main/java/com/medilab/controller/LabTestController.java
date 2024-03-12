package com.medilab.controller;

import com.medilab.entity.LabTestEntity;
import com.medilab.model.LabTest;
import com.medilab.service.LabTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/labtest")
public class LabTestController {

    @Autowired
    LabTestService labTestService;

    @PostMapping("/add")
    public LabTestEntity addLabTest(@RequestBody LabTest labTest) {
        return labTestService.createLabTest(labTest);
    }
}
