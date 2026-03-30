package com.krd.repositories;

import com.krd.entities.Category;
import com.krd.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRespository extends JpaRepository<Category, Long> {

}

