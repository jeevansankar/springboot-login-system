package com.jeevan.login.repository;
import com.jeevan.login.entity.LoginEntity;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryInterface extends JpaRepository<LoginEntity, Long>{
    Optional<LoginEntity> findByUsername(String username);  

}
