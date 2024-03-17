package com.medilab.repository;

import com.medilab.entity.DoctorEntity;
import com.medilab.entity.PatientEntity;
import org.springframework.data.repository.CrudRepository;

public interface DoctorRepository extends CrudRepository<DoctorEntity,Integer> {

}
