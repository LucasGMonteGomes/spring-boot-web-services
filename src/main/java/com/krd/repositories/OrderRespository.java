package com.krd.repositories;

import com.krd.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRespository extends JpaRepository<Order, Long> {

}

