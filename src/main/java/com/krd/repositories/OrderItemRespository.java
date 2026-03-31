package com.krd.repositories;

import com.krd.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRespository extends JpaRepository<OrderItem, Long> {

}

