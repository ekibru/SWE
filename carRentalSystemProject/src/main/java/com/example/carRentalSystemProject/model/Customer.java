package com.example.carRentalSystemProject.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name ="customer")
@Data
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerId;
    private String firstName;
    private String lastName;
    private String phone;
    @Column(name ="ssn")
    private String socialSecurityNumber;

}
