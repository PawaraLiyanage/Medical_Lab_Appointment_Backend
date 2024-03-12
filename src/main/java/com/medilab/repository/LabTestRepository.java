package com.medilab.repository;

import com.medilab.entity.LabTestEntity;
import com.medilab.model.LabTest;
import org.springframework.data.repository.CrudRepository;

public interface LabTestRepository extends CrudRepository<LabTestEntity, String> {

}
