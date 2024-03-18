package com.medilab.service;

import com.medilab.entity.DoctorEntity;
import com.medilab.model.Doctor;

import java.util.ArrayList;

public interface DoctorService {

    DoctorEntity createDoctor(Doctor doctor);

    ArrayList<Doctor> retrieveDoctor();

    boolean removeDoctor(int id);

}
