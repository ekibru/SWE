package com.example.carRentalSystemProject.service;

import com.example.carRentalSystemProject.model.CarType;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface CarTypeService {
    List<CarType>getAllCarType();
}
