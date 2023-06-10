package com.example.carRentalSystemProject.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table
@Data
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String street;
    private String city;
    private String state;
    private String zipcode;

}
