package com.medilab.controller;

import com.medilab.entity.DoctorEntity;
import com.medilab.model.Doctor;
import com.medilab.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

@RestController
@RequestMapping("/doctor")
@CrossOrigin
public class DoctorController {

    @Autowired
    DoctorService doctorService;

    @PostMapping("/add")
    public DoctorEntity addDoctor(@RequestBody Doctor doctor) {
        return doctorService.createDoctor(doctor);
    }

    @GetMapping("/get")
    ArrayList<Doctor> getDoctor() {
        return doctorService.retrieveDoctor();
    }

    @DeleteMapping("{id}")
    Map<String, String> deleteDoctor(@PathVariable int id) {
        boolean isRemoved = doctorService.removeDoctor(id);
        if (isRemoved) {
            return Collections.singletonMap("Status", "Doctor Removed");

        } else {
            return Collections.singletonMap("Status", "Doctor ID not found");
        }
    }


}
