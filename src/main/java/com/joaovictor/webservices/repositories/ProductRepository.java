package com.joaovictor.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.joaovictor.webservices.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
