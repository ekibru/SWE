package com.example.carRentalSystemProject.service;

import com.example.carRentalSystemProject.model.Car;
import com.example.carRentalSystemProject.model.CarType;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface CarService {
    List<Car>getAllCar();
    CarType saveCars(CarType carType);

    Car getCarById(Long id);

    void saveCar(Car car);

    void deleteCar(Car car);
}
