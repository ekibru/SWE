package com.example.carRentalSystemProject.service;

import com.example.carRentalSystemProject.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReservationService {
    List<Reservation> getAllReservations();

    Reservation getReservationById(Long id);

    Reservation saveReservation(Reservation reservation);

    void deleteReservation(Reservation reservation);



}
