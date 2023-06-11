package com.example.carRentalSystemProject.controller;

import com.example.carRentalSystemProject.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CarController {
    @Autowired
    private CarService carService;
    @GetMapping("/cars")
    public String listCustomer(Model model) {
        model.addAttribute("cars", carService.getAllCar());
        return "cars";

    }
    }
