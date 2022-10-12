package com.auth.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.auth.model.Registration;

@Repository
public interface RegistrationRepo extends JpaRepository<Registration, Long>{

}
