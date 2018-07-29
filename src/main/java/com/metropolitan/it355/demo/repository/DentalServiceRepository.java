package com.metropolitan.it355.demo.repository;

import com.metropolitan.it355.demo.model.DentalService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DentalServiceRepository extends JpaRepository<DentalService, Long> {
}
