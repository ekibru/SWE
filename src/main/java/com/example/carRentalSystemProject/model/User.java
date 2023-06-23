package com.example.carRentalSystemProject.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name ="user")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String userName;
    private String password;
    private String email;



}
