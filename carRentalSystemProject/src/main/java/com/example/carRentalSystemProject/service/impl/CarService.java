package com.example.carRentalSystemProject.service.impl;

import com.example.carRentalSystemProject.model.Car;
import com.example.carRentalSystemProject.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CarService implements com.example.carRentalSystemProject.service.CarService {
    @Autowired
    private CarRepository carRepository;
    @Override
    public List<Car> getAllCar() {
        return carRepository.findAll();
    }
}
