package com.medilab.controller;

import com.medilab.entity.LabTestEntity;
import com.medilab.model.LabTest;
import com.medilab.service.LabTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/labtest")
@CrossOrigin
public class LabTestController {

    @Autowired
    LabTestService labTestService;

    @PostMapping("/add")
    public LabTestEntity addLabTest(@RequestBody LabTest labTest) {
        return labTestService.createLabTest(labTest);
    }

    @GetMapping("/get")
    ArrayList<LabTest> getLabTest() {
        return labTestService.viewLabTest();
    }

    @GetMapping("/find-by-test-name/{testName}")
    public LabTest findByTestName(@PathVariable String testName){
        return labTestService.findByTestName(testName);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<String> deleteLabTest(@PathVariable int id){
        return labTestService.deleteLabTest(id)?
                ResponseEntity.ok("Deleted"):
                ResponseEntity.notFound().build();
    }


}
