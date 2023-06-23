package com.example.carRentalSystemProject.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
@Entity
@Table(name ="rentals")
@Data
public class Rentals {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate startDate;
    private LocalDate endDate;
    private int duration;

}
