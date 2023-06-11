package com.example.carRentalSystemProject.service;

import com.example.carRentalSystemProject.model.Car;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface CarService {
    List<Car>getAllCar();
}
