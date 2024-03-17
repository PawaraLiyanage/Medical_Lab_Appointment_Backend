package com.medilab.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.medilab.entity.DoctorEntity;
import com.medilab.entity.PatientEntity;
import com.medilab.model.Doctor;
import com.medilab.repository.DoctorRepository;
import com.medilab.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Optional;

public class DoctorServiceImpl implements DoctorService {
    @Autowired
    DoctorRepository doctorRepository;
    @Autowired
    ObjectMapper mapper;


    @Override
    public DoctorEntity createDoctor(Doctor doctor) {
        DoctorEntity doctorEntity = mapper.convertValue(doctor, DoctorEntity.class);
        doctorRepository.save(doctorEntity);
        return doctorEntity;

    }

    @Override
    public ArrayList<Doctor> viewDoctor() {
        ArrayList<Doctor> List = new ArrayList<>();
        Iterable<DoctorEntity> allDoctor = doctorRepository.findAll();
        Iterator<DoctorEntity> iterator = allDoctor.iterator();

        while (iterator.hasNext()) {
            DoctorEntity entity = iterator.next();
            Doctor doctor = mapper.convertValue(entity, Doctor.class);
            List.add(doctor);
        }
        return List;
    }

    @Override
    public boolean removeDoctor(int id) {
        Optional<DoctorEntity> doctorEntityOptional = doctorRepository.findById(id);
        if(doctorEntityOptional.isPresent()){
            doctorRepository.deleteById(id);
            return true;
        }
        return false;
    }

}
