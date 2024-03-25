package com.medilab.repository;

import com.medilab.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity,Long> {
    UserEntity findByUserName(String userName);

    Boolean existsByUserName(String userName);
}
