package com.example.carRentalSystemProject.service.impl;

import com.example.carRentalSystemProject.model.Car;
import com.example.carRentalSystemProject.model.CarType;
import com.example.carRentalSystemProject.repository.CarRepository;
import com.example.carRentalSystemProject.repository.CarTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CarService implements com.example.carRentalSystemProject.service.CarService {
    @Autowired
    private CarRepository carRepository;
    @Autowired
    private CarTypeRepository carTypeRepository;

    public CarService(CarRepository carRepository, CarTypeRepository carTypeRepository) {
        this.carRepository = carRepository;
        this.carTypeRepository = carTypeRepository;
    }

    @Override
    public List<Car> getAllCar() {
        return carRepository.findAll();
    }

    @Override
    public CarType saveCars(CarType carType) {
        return carTypeRepository.save(carType);
    }

    @Override
    public Car getCarById(Long id) {
        return carRepository.getReferenceById(id);
    }

    @Override
    public void saveCar(Car car) {
        carRepository.save(car);
    }

    @Override
    public void deleteCar(Car car) {
        carRepository.delete(car);
    }
}
