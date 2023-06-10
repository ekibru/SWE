package com.example.carRentalSystemProject.model;

import jakarta.persistence.*;

@Entity
@Table(name ="car_type")
public class CarType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String make;
    private String model;
    private String color;
    private String year;

}
