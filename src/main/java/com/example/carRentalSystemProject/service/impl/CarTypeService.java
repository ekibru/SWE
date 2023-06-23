package com.example.carRentalSystemProject.service.impl;

import com.example.carRentalSystemProject.model.CarType;
import com.example.carRentalSystemProject.repository.CarTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarTypeService implements com.example.carRentalSystemProject.service.CarTypeService {

    @Autowired
    private CarTypeRepository carTypeRepository;
    @Override
    public List<CarType> getAllCarType() {
        return carTypeRepository.findAll();
    }
}
