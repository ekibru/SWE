package com.example.carRentalSystemProject.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table
@Data
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private boolean available;
}
