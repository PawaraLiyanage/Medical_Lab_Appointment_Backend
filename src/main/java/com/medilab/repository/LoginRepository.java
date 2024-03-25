package com.medilab.repository;

import com.medilab.entity.LoginEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepository extends JpaRepository<LoginEntity,Long> {
    Boolean existsByEmailAndPassword(String email,String password);
}
