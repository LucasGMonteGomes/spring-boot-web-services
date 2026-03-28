package com.krd.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.krd.entities.User;

public interface UserRespository extends JpaRepository<User, Long> {

}
