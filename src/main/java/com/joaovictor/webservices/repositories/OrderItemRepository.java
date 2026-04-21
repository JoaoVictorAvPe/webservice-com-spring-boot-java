package com.joaovictor.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.joaovictor.webservices.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
    
}
