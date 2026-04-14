package com.joaovictor.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.joaovictor.webservices.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
