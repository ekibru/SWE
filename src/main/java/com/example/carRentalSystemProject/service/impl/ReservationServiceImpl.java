package com.example.carRentalSystemProject.service.impl;

import com.example.carRentalSystemProject.model.Reservation;
import com.example.carRentalSystemProject.repository.ReservationRepository;
import com.example.carRentalSystemProject.service.ReservationService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationServiceImpl implements ReservationService {
    private ReservationRepository reservationRepository;

    public List<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }

    public Reservation getReservationById(Long id) {
        return reservationRepository.findById(id).orElse(null);
    }

    public Reservation saveReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    public void deleteReservation(Reservation reservation) {
        reservationRepository.delete(reservation);
    }
}
