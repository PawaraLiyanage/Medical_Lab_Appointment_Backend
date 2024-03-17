package com.medilab.service;

import com.medilab.entity.DoctorEntity;
import com.medilab.model.Doctor;
import com.medilab.model.Patient;

import java.util.ArrayList;

public interface DoctorService {

    DoctorEntity createDoctor(Doctor doctor);

    ArrayList<Doctor> viewDoctor();

}
