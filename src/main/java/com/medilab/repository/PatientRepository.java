package com.medilab.repository;


import com.medilab.entity.PatientEntity;
import org.springframework.data.repository.CrudRepository;

public interface PatientRepository extends CrudRepository<PatientEntity,Integer> {

}
