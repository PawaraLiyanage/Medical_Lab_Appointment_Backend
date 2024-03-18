package com.medilab.service;

import com.medilab.entity.LabTechnicianEntity;
import com.medilab.model.LabTechnician;
import com.medilab.model.Patient;

import java.util.ArrayList;

public interface LabTechnicianService {
  public LabTechnicianEntity createLabTechnician(LabTechnician labTechnician);

  ArrayList<LabTechnician> retrieveLabTechnician();

  public boolean removeLabTechnician(int id);

}
