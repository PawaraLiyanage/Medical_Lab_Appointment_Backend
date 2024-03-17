package com.medilab.repository;

import com.medilab.entity.LabTestEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface LabTestRepository extends JpaRepository<LabTestEntity, String> {
    public LabTestEntity findByTestName(String testName);
}
