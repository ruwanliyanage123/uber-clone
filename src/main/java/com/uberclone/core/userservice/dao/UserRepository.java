package com.uberclone.core.userservice.dao;

import com.uberclone.core.userservice.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
