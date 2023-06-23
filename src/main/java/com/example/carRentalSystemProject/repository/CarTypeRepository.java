package com.example.carRentalSystemProject.repository;

import com.example.carRentalSystemProject.model.CarType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarTypeRepository extends JpaRepository<CarType,Long> {
}
