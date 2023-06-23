package com.example.carRentalSystemProject.repository;

import com.example.carRentalSystemProject.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation,Long> {
}
